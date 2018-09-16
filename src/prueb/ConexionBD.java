package prueb;


import java.sql.*;

public class ConexionBD {

    // Ruta de nuestra base de datos
    private String servidor = "jdbc:mysql://localhost:3306/tienda?autoReconnect=true&useSSL=false";

    // Nombre de usuario de mysql
    private String username = "root";

    // Clave de usuario de mysql
    private String password = "root";

    // Nuestra librería mysql
    private String driver = "com.mysql.jdbc.Driver";

    // Objeto del tipo Connection para crear la conexión
    private Connection con;

    public Connection Conexion()
    {
        try {
            // Cargar drivers de MySQL
            Class.forName(driver);

            // Establecer la conexion con la base de datos
            con = DriverManager.getConnection(servidor, username, password);

            System.out.println("Conexión realizada a la base de datos con éxito.");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error!, conexión fallida a la base de datos."+e);
        }
        return con;
    }

    public Connection getConnection() {
        Connection con= Conexion();
        return con; // Retorno el objeto Connection
    }
    }