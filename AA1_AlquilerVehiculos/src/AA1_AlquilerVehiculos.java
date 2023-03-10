import AA1_AlquilerVehiculo_Clases.*;

/*import AA1_AlquilerVehiculo_Clases.Coche;

/*public class AA1_AlquilerVehiculos

   public static void main(String[] args) {
        AA1_AlquilerVehiculos aa1 = new AA1_AlquilerVehiculos();
        aa1.inicio();
    }

    /*void inicio() {
        // Crea un objeto de cada una de las clases Coche, Moto y Camión.

        // Crear un objeto de la clase Coche
        Coche nCoche = new Coche("Ford", "Mustang", 2021, 35000, "Rojo", 2.3);

        // Crear un objeto de la clase Moto
        Moto nMoto = new Moto("Honda", "CBR600RR", 2020, 12000, "Blanco", 599);

        // Crear un objeto de la clase Camión
        Camion nCamion = new Camion("Volvo", "FH16", 2022, 95000, "Azul", 8.0, 40.0);


        // Crea dos objetos de tipo cliente.

        Cliente cliente1 = new Cliente("Juan", "Pérez", "12345678A", "Calle Mayor, 1", "Madrid", "España");
        Cliente cliente2 = new Cliente("María", "García", "87654321B", "Calle del Sol, 2", "Barcelona", "España");

        // Crea tres contratos de alquiler, uno para cada tipo de vehículo, dos de los contratos tendrán el mismo cliente.
        //        Utilizando los métodos toString, muestra por pantalla los datos de todos los objetos que has creado.
        // Crear los objetos de los vehículos
        Coche miCoche = new Coche("Ford", "Mustang", 2021, 35000, "Rojo", 2.3);
        Moto miMoto = new Moto("Honda", "CBR600RR", 2020, 12000, "Blanco", 599);
        Camion miCamion = new Camion("Volvo", "FH16", 2022, 95000, "Azul", 8.0, 40.0);

        // Crear los objetos de los clientes
        Cliente cliente1 = new Cliente("Juan", "Pérez", "12345678A", "Calle Mayor, 1", "Madrid", "España");
        Cliente cliente2 = new Cliente("María", "García", "87654321B", "Calle del Sol, 2", "Barcelona", "España");

        // Crear los objetos de los contratos
        ContratoAlquiler contrato1 = new ContratoAlquiler(cliente1, miCoche, "01/03/2023", "05/03/2023");
        ContratoAlquiler contrato2 = new ContratoAlquiler(cliente1, miMoto, "03/03/2023", "06/03/2023");
        ContratoAlquiler contrato3 = new ContratoAlquiler(cliente2, miCamion, "02/03/2023", "10/03/2023");

        System.out.println(miCoche.toString());
        System.out.println(miMoto.toString());
        System.out.println(miCamion.toString());
        System.out.println(cliente1.toString());
        System.out.println(contrato1.toString());
        System.out.println(contrato2.toString());
        System.out.println(contrato3.toString());


    }
}*/
public class AA1_AlquilerVehiculos {
    public static void main(String[] args) {
        // Crea un objeto de cada una de las clases Coche, Moto y Camión.

        // Crear un objeto de la clase Coche
        Coche nCoche = new Coche("Ford", "Mustang", 2021, 35000, "Rojo", 2.3);

        // Crear un objeto de la clase Moto
        Moto nMoto = new Moto("Honda", "CBR600RR", 2020, 12000, "Blanco", 599);

        // Crear un objeto de la clase Camión
        Camion nCamion = new Camion("Volvo", "FH16", 2022, 95000, "Azul", 8.0, 40.0);

        // Crea dos objetos de tipo cliente.
        Cliente cliente1 = new Cliente("Juan", "Pérez", "12345678A", "Calle Mayor, 1", "Madrid", "España");
        Cliente cliente2 = new Cliente("María", "García", "87654321B", "Calle del Sol, 2", "Barcelona", "España");

        // Crea tres contratos de alquiler, uno para cada tipo de vehículo, dos de los contratos tendrán el mismo cliente.
        // Utilizando los métodos toString, muestra por pantalla los datos de todos los objetos que has creado.

        // Crear los objetos de los contratos
        ContratoAlquiler contrato1 = new ContratoAlquiler(cliente1, nCoche, "01/03/2023", "05/03/2023");
        ContratoAlquiler contrato2 = new ContratoAlquiler(cliente1, nMoto, "03/03/2023", "06/03/2023");
        ContratoAlquiler contrato3 = new ContratoAlquiler(cliente2, nCamion, "02/03/2023", "10/03/2023");

        System.out.println(nCoche.toString());
        System.out.println(nMoto.toString());
        System.out.println(nCamion.toString());
        System.out.println(cliente1.toString());
        System.out.println(contrato1.toString());
        System.out.println(contrato2.toString());
        System.out.println(contrato3.toString());
    }
}
