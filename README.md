<h1 align="center">API BCI</h1>

## About

API RESTful de creación de usuarios


## Installation

Clonar el proyecto desde github con ssh.

```
git clone git@github.com:aguilardc/api-bci.git
```

O puedes descargarlos directamente y extraerlos a tu directorio web.

## Ejecución

Puedes usar cualquier IDE, se recomienda intellij idea, ejecutar dando click en el boton **RUN**
visitar la url 

```
http://localhost:8080
```

Utilizar **Postman** o **Insomnia** para probar el endpoint de crear usuarios
con el metodo post

### endpoint
```
http://localhost:8080/api/users
```

### example body
```
{
	"name": "Juan Rodriguez",
	"email": "juanr@odriguezorg.com",
	"password": "hunter2",
	"phones": [
		{
			"number": "1234567",
			"cityCode": "1",
			"countryCode": "57"
		},
				{
			"number": "12345678",
			"cityCode": "1",
			"countryCode": "57"
		}
	]
}
```
### example Response
```
{
	"id": "888f7d3e-76a3-42ad-bb33-5abe0c4d9a02",
	"name": "Juan Rodriguez",
	"email": "juanr@odriguezorg.com",
	"created": "2024-09-16T12:14:59.423+00:00",
	"modified": "2024-09-16T12:14:59.423+00:00",
	"lastLogin": "2024-09-16T12:14:59.423+00:00",
	"token": "8e338d0d-a5a7-458a-9cd2-e65dfa804fa8",
	"active": true
}
```

## SWAGGER

Para utilizar swagger visitar la siguiente url

```
http://localhost:8080/swagger-ui/index.html
```


## H2 Database
La base de datos utilizada es H2

para poder visualizar las tablas y datos visitar la siguiente url

```
http://localhost:8080/h2-console
```

parametros a configurar

* Driver Class: _org.h2.Driver_
* JDBC URL: _jdbc:h2:mem:users_
* User Name: _sa_
* Password: _(sin password)_



