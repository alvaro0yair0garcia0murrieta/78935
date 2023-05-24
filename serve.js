const express = require('express');
const { graphqlHTTP } = require('express-graphql');
const { buildSchema } = require('graphql');

// Construir un esquema, usando el lenguaje de esquema GraphQL
const esquema = buildSchema(`
  type Query {
    estudiantes: [Estudiante]
    estudiante(id: ID!): Estudiante
  }

  type Mutation {
    agregarEstudiante(nombre: String!, correo: String!, edad: Int!): Estudiante
  }

  type Estudiante {
    id: ID!
    nombre: String!
    correo: String!
    edad: Int!
  }
`);

// Datos de muestra
const datosEstudiantes = [
  {
    id: '1',
    nombre: 'Juan Pérez',
    correo: 'juan.perez@example.com',
    edad: 20,
  },
  {
    id: '2',
    nombre: 'María García',
    correo: 'maria.garcia@example.com',
    edad: 22,
  },
];

// Resolvedor principal
const root = {
  estudiantes: () => datosEstudiantes,
  estudiante: ({ id }) => datosEstudiantes.find((estudiante) => estudiante.id === id),
  agregarEstudiante: ({ nombre, correo, edad }) => {
    const nuevoEstudiante = { id: String(datosEstudiantes.length + 1), nombre, correo, edad };
    datosEstudiantes.push(nuevoEstudiante);
    return nuevoEstudiante;
  },
};

// Crear un servidor express y un punto final GraphQL
const app = express();
app.use(
  '/graphql',
  graphqlHTTP({
    schema: esquema,
    rootValue: root,
    graphiql: true, // Habilitar interfaz de usuario GraphiQL
  })
);

const puerto = 3000;
app.listen(puerto, () => {
  console.log(`Servidor ejecutándose en http://localhost:${puerto}/graphql`);
});
