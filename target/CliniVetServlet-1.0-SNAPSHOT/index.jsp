<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Dueño Paciente</title>
    </head>
    <body>
        <h1>Datos del Dueño del Paciente</h1>
        <form action="SvUsuarios" method="POST">
            <p><label>Identificacion: </label><input type="number" name="identificacion"></p>
            <p><label>Nombres: </label><input type="text" name="nombres"></p>
            <p><label>Apellidos: </label><input type="text" name="apellidos"></p>
            <p><label>Direccion: </label><input type="text" name="direccion"></p>
            <p><label>Telefono: </label><input type="text" name="telefono"></p>
            <p><label>Correo: </label><input type="text" name="correo"></p>
            <button type="submit">Enviar</button>
        </form>
        
        <h1>Ver lista de los dueños de los pacientes</h1>
        <p>Para ver los datos de los dueños de los pacientes cargados haga click en el siguiente botón</p>
        <form action="SvUsuarios" method="GET">
            <button type="submit">Mostrar Usuarios</button>
        </form>
        
    </body>
</html>
