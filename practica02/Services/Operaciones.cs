using System;   
using WDSL.mensajes;
namespace WDSL.operaciones
{
    public class Operaciones :Mensajes
    {
public List<String>name= new List<string>();        
public string Saludar(string nombre)
        {
		name.Add(nombre);
            string msj= "hola "+ nombre;
             return msj; 
        }

        public string Mostrar(int id)
        {
            return name[id];
           
        }
    }
    
}
