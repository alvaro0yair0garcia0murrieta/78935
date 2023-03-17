FROM mcr.microsoft.com/dotnet/sdk:6.0 as build-env
WORKDIR /practica02
COPY practica02/*.csproj .
RUN dotnet restore
COPY practica02 .
RUN dotnet publish -c Release -o /publish
FROM mcr.microsoft.com/dotnet/aspnet:6.0 as runtime
WORKDIR /publish
COPY --from=build-env /publish .
EXPOSE 80
ENTRYPOINT ["dotnet", "soap-test.dll"]
