package co.edu.uniquindio.poo;

import java.util.Scanner;

/**
 * Clase principal de la aplicación de gestión de vehículos de transporte y carga.
 * Permite interactuar con la empresa de transporte mediante un menú que ofrece 
 * diversas opciones para administrar vehículos y usuarios.
 */
public class App {

    public static Scanner scanner=new Scanner(System.in);//se crea el scanner que usan todas los metodos
    public static void main(String[] args) {

        EmpresaTransporte empresa= new EmpresaTransporte();//se crea el objeto empresa 
        inicializarDatos(empresa);
        int opcion= 5;
        while(opcion!=0){ //se crea el bucle de menu
            System.out.print("\033[H\033[2J");
            System.out.flush(); 
            System.out.println("\nMenú principal:");
            System.out.println("1- Ingresar Vehiculo Carga");
            System.out.println("2- Ingresar Vehiculo de transpote");
            System.out.println("3- Buscar vehiculo por placa");
            System.out.println("4- mostrar vehiculos registrados");
            System.out.println("5- mostrar usuarios de peso superior a");
            System.out.println("6- mostrar listado de usuarios mayores a");
            System.out.println("7- agregar usuario");
            System.out.println("0- salir\n");
            System.out.println("Ingrese la opcion que desea realizar:");
        
            opcion=scanner.nextInt();
            //redirige el programa a la opcion escogida por el usuario
            switch (opcion) {
                
                case 0:
                    chao();
                    scanner.nextLine();
                    break;
                case 1:
                    ingresarVehiculoCarga(scanner,empresa);
                    break;
                case 2:
                    ingresarVehiculoTrasporte(scanner,empresa);
                    break;
                case 3:
                    bucarPlaca(scanner,empresa);
                    break;
                case 4:
                    mostrarVehiculos(scanner,empresa);
                    break;
                case 5:
                    usuariosPesoSuperior(scanner,empresa);
                    break;
                case 6:
                    usuariosMayores(scanner,empresa);
                    break;
                
                case 7:
                    agregarUsuario(scanner,empresa);
                    break;
        
            }
        }
    }

    public static void inicializarDatos(EmpresaTransporte empresa){
        //se realiza el registro de los propietarios de 5 vehiculos de carga y se guardan en el objeto empresa
        Propietario propietario1=new Propietario("jesus","12345678", "jesus@uqvirtual.edu.co","3123456789",null);
        Propietario propietario2=new Propietario("chucho","23456781", "chucho@uqvirtual.edu.co","3234567891",null);
        Propietario propietario3=new Propietario("alejo","34567812", "alejo@uqvirtual.edu.co","3345678912",null);
        Propietario propietario4=new Propietario("ronaldo","45678123", "ronaldo@uqvirtual.edu.co","3456789123",null);
        Propietario propietario5=new Propietario("sebastian","56781234", "sebastian@uqvirtual.edu.co","3567891234",null);

        VehiculoCarga vehiculoCarga1= new VehiculoCarga("dvv42e", "2022", "foton","negro",propietario1.cedula, 500, 2);
        vehiculoCarga1.propietariosAsociados.add(propietario2);
        vehiculoCarga1.propietariosAsociados.add(propietario3);
        propietario1.vehiculoRegistrado = vehiculoCarga1.placa;
        

        VehiculoCarga vehiculoCarga2= new VehiculoCarga("vv42d", "2022", "volvo","negro",propietario2.cedula, 500, 3);
        propietario2.vehiculoRegistrado = vehiculoCarga2.placa;
        
        VehiculoCarga vehiculoCarga3= new VehiculoCarga("v42edv", "2022", "mercedes","negro",propietario3.cedula, 500, 4);
        propietario3.vehiculoRegistrado = vehiculoCarga3.placa;
        vehiculoCarga3.propietariosAsociados.add(propietario4);
        vehiculoCarga3.propietariosAsociados.add(propietario5);
        
        VehiculoCarga vehiculoCarga4= new VehiculoCarga("42edvv", "2022", "foton","negro",propietario4.cedula, 500, 5);
        propietario4.vehiculoRegistrado = vehiculoCarga4.placa;
        VehiculoCarga vehiculoCarga5= new VehiculoCarga("2edvv4", "2022", "foton","negro",propietario5.cedula, 500, 6);
        propietario5.vehiculoRegistrado = vehiculoCarga5.placa;
        
        //se agregan datos a las listas
        empresa.propietarios.add(propietario1);
        empresa.propietarios.add(propietario2);
        empresa.propietarios.add(propietario3);
        empresa.propietarios.add(propietario4);
        empresa.propietarios.add(propietario5);

        empresa.vehiculosCarga.add(vehiculoCarga1);
        empresa.vehiculosCarga.add(vehiculoCarga2);
        empresa.vehiculosCarga.add(vehiculoCarga3);
        empresa.vehiculosCarga.add(vehiculoCarga4);
        empresa.vehiculosCarga.add(vehiculoCarga5);

        //se realiza el registro de los propietarios de 3 vehiculos de transporte y se guardan en el objeto empresa

        Propietario propietario6=new Propietario("miguel","87654321", "miguel@uqvirtual.edu.co","3987654321",null);
        Propietario propietario7=new Propietario("juan","76543218", "juan@uqvirtual.edu.co","3876543219",null);
        Propietario propietario8=new Propietario("german","65432187", "german@uqvirtual.edu.co","37656432198",null);

        VehiculoTransporte vehiculoTransporte1= new VehiculoTransporte ("zdf36f", "2024", "mercedez", "blanco", propietario6.cedula, 4);
        propietario6.vehiculoRegistrado=vehiculoTransporte1.placa;
        vehiculoTransporte1.propietariosAsociados.add(propietario6);
        vehiculoTransporte1.propietariosAsociados.add(propietario7);

        VehiculoTransporte vehiculoTransporte2= new VehiculoTransporte ("df36fz", "2024", "mercedez", "blanco", propietario7.cedula, 4);
        propietario7.vehiculoRegistrado=vehiculoTransporte2.placa;

        VehiculoTransporte vehiculoTransporte3= new VehiculoTransporte ("f36fzd", "2024", "mercedez", "blanco", propietario8.cedula, 4);
        propietario8.vehiculoRegistrado=vehiculoTransporte3.placa;
        vehiculoTransporte3.propietariosAsociados.add(propietario8);
        vehiculoTransporte3.propietariosAsociados.add(propietario6);
        
        //se crean usuarios para las lista de los vehiculos de transporte y se guardan valores
        Usuario usuario1=new Usuario("luz", 40, 50, vehiculoTransporte1.placa);
        Usuario usuario2=new Usuario("mariela", 60, 60, vehiculoTransporte1.placa);
        Usuario usuario3=new Usuario("elmer", 50, 80, vehiculoTransporte1.placa);
        vehiculoTransporte1.usuariosAsociados.add(usuario1);
        vehiculoTransporte1.usuariosAsociados.add(usuario2);
        vehiculoTransporte1.usuariosAsociados.add(usuario3); 

        Usuario usuario4=new Usuario("luz2", 40, 50, vehiculoTransporte2.placa);
        Usuario usuario5=new Usuario("mariela2", 60, 60, vehiculoTransporte2.placa);
        Usuario usuario6=new Usuario("elmer2", 50, 80, vehiculoTransporte2.placa);
        vehiculoTransporte2.usuariosAsociados.add(usuario4);
        vehiculoTransporte2.usuariosAsociados.add(usuario5);
        vehiculoTransporte2.usuariosAsociados.add(usuario6); 

        Usuario usuario7=new Usuario("luz3", 40, 50, vehiculoTransporte3.placa);
        Usuario usuario8=new Usuario("mariela3", 60, 60, vehiculoTransporte3.placa);
        Usuario usuario9=new Usuario("elmer3", 50, 80, vehiculoTransporte3.placa);
        vehiculoTransporte3.usuariosAsociados.add(usuario7);
        vehiculoTransporte3.usuariosAsociados.add(usuario8);
        vehiculoTransporte3.usuariosAsociados.add(usuario9);        
                
        //se agregan datos a las listas del objeto empresa
        empresa.propietarios.add(propietario6);
        empresa.propietarios.add(propietario7);
        empresa.propietarios.add(propietario8);              
        empresa.vehiculosTransporte.add(vehiculoTransporte1);
        empresa.vehiculosTransporte.add(vehiculoTransporte2);
        empresa.vehiculosTransporte.add(vehiculoTransporte3);
    }

    public static void ingresarVehiculoCarga(Scanner scanner,EmpresaTransporte empresa){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); //estas dos lineas permite permiten que la consola muestre la informacion de forma organizada borra do los datos que ya no son necesarios

        //
        Propietario propietario= new Propietario(null,null,null,null,null);
        VehiculoCarga vehiculo= new VehiculoCarga(null, null, null, null, null, 0, 0);
        scanner.nextLine();
        //solicito la informacio del propietario y vehiculo a registrar
        System.out.println("ingrese nombre del propietario: ");
        propietario.nombre=scanner.nextLine();
        System.out.println("ingrese cedula del propietario: ");
        propietario.cedula=scanner.nextLine();
        vehiculo.responsable=propietario.cedula;
        System.out.println("ingrese email del propietario: ");
        propietario.email=scanner.nextLine();
        System.out.println("ingrese telefono del propietario: ");
        propietario.telefono=scanner.nextLine();
        System.out.println("ingrese placa del vehiculo de carga: ");
        propietario.vehiculoRegistrado=scanner.nextLine();
        vehiculo.placa=propietario.vehiculoRegistrado;
        System.out.println("ingrese modelo del vehiculo de carga: ");
        vehiculo.modelo=scanner.nextLine();
        System.out.println("ingrese marca del vehiculo de carga: ");
        vehiculo.marca=scanner.nextLine();
        System.out.println("ingrese color del vehiculo de carga: ");
        vehiculo.color=scanner.nextLine();
        System.out.println("ingrese capacidad de carga del vehiculo: ");
        vehiculo.capacidadCarga=scanner.nextDouble();
        System.out.println("ingrese numero de ejes del vehiculo de carga: ");
        vehiculo.numeroEjes=scanner.nextInt();
        //guardo datos en las listas
        empresa.propietarios.add(propietario);
        empresa.vehiculosCarga.add(vehiculo);

    }

    public static void ingresarVehiculoTrasporte(Scanner scanner,EmpresaTransporte empresa){
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        Propietario propietario= new Propietario(null,null,null,null,null);
        VehiculoTransporte vehiculo= new VehiculoTransporte(null, null, null, null, null, 0);
        scanner.nextLine();
        //solicito la informacio del propietario y vehiculo a registrar
        System.out.println("ingrese nombre del propietario:");
        propietario.nombre=scanner.nextLine();
        System.out.println("ingrese cedula del propietario:");
        propietario.cedula=scanner.nextLine();
        vehiculo.responsable=propietario.cedula;
        System.out.println("ingrese email del propietario:");
        propietario.email=scanner.nextLine();
        System.out.println("ingrese telefono del propietario:");
        propietario.telefono=scanner.nextLine();
        System.out.println("ingrese placa del vehiculo de carga:");
        propietario.vehiculoRegistrado=scanner.nextLine();
        vehiculo.placa=propietario.vehiculoRegistrado;
        System.out.println("ingrese modelo del vehiculo de carga:");
        vehiculo.modelo=scanner.nextLine();
        System.out.println("ingrese marca del vehiculo de carga:");
        vehiculo.marca=scanner.nextLine();
        System.out.println("ingrese color del vehiculo de carga:");
        vehiculo.color=scanner.nextLine();
        System.out.println("ingrese capacidad maxima de pasajeros del vehiculo:");
        vehiculo.maximoPasajeros=scanner.nextInt();
        //guardo datos en las listas
        empresa.propietarios.add(propietario);
        empresa.vehiculosTransporte.add(vehiculo);
    }

    public static void bucarPlaca(Scanner scanner,EmpresaTransporte empresa){
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        scanner.nextLine();

        String placa = null;
        System.out.println("digite el numero de placa a buscar:");
        placa=scanner.nextLine();
        for(VehiculoCarga vehiculoCarga:empresa.vehiculosCarga){
            if(vehiculoCarga.placa.equals(placa)){
                System.out.println("la informacion de vehiculo es:\n");
                System.out.print("placa: "+vehiculoCarga.placa+"\nmodelo: "+vehiculoCarga.modelo+"\nmarca: "+vehiculoCarga.marca+"\ncolor: "+vehiculoCarga.color+"\ncapacidad: "+vehiculoCarga.capacidadCarga+"\nnumero de ejes: "+vehiculoCarga.numeroEjes+"\n");
                System.out.println("con propietario:");
                for(Propietario propietario:empresa.propietarios){
                    if(propietario.vehiculoRegistrado.equals(placa)){
                        System.out.println("nombre: "+propietario.nombre+"\ncedula: "+propietario.cedula+"\ntelefono: "+propietario.telefono+"\nemail: "+propietario.email);
                    }
                }
            }
        }
        for(VehiculoTransporte vehiculoTransporte:empresa.vehiculosTransporte){
            if(vehiculoTransporte.placa.equals(placa)){
                System.out.println("la informacion de vehiculo es:\n");
                System.out.println("placa: "+vehiculoTransporte.placa+"\nmodelo: "+vehiculoTransporte.modelo+"\nmarca: "+vehiculoTransporte.marca+"\ncolor: "+vehiculoTransporte.color+"\ncapacidad de pasajeros: "+vehiculoTransporte.maximoPasajeros+"\nusuarios transportados: "+vehiculoTransporte.usuariosAsociados.size());
                System.out.println("con propietario:");
                for(Propietario propietario:empresa.propietarios){
                    if(propietario.vehiculoRegistrado.equals(placa)){
                        System.out.println("nombre: "+propietario.nombre+"\ncedula: "+propietario.cedula+"\ntelefono: "+propietario.telefono+"\nemail: "+propietario.email);
                    }
                }
            }
        }
        scanner.nextLine();
    }

    public static void mostrarVehiculos(Scanner scanner, EmpresaTransporte empresa){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int contador=1;
        System.out.println("Vehiculos registrados:");
        for(VehiculoTransporte vehiculoTransporte:empresa.vehiculosTransporte){

            System.out.print(contador+"- vehiculo de transporte con placa: "+vehiculoTransporte.placa+" modelo: "+vehiculoTransporte.modelo+" marca: "+vehiculoTransporte.marca+" color: "+vehiculoTransporte.color+" capacidad de pasajeros: "+vehiculoTransporte.maximoPasajeros+" propietario: "+vehiculoTransporte.responsable+"\n");
            contador++;
        }
        for(VehiculoCarga vehiculoCarga:empresa.vehiculosCarga){
            System.out.print(contador+"- vehiculo de carga con placa: "+vehiculoCarga.placa+" modelo: "+vehiculoCarga.modelo+" marca: "+vehiculoCarga.marca+" color: "+vehiculoCarga.color+" capacidad: "+vehiculoCarga.capacidadCarga+" numero de ejes: "+vehiculoCarga.numeroEjes+" propietario: "+vehiculoCarga.responsable+"\n");
            contador++;
        }

        scanner.nextLine();
        scanner.nextLine();
    }

    public static void usuariosPesoSuperior(Scanner scanner, EmpresaTransporte empresa){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        scanner.nextLine();
        double peso=0;
        System.out.println("ingrese el peso:");
        peso=scanner.nextInt();
        System.out.println("los usuarios que superan "+peso+" de peso son:");

        for(VehiculoTransporte vehiculo:empresa.vehiculosTransporte){
            for(Usuario usuario:vehiculo.usuariosAsociados){
                if(peso<usuario.peso){
                    System.out.println("nombre: "+usuario.nombre+"\nvehiculo: "+usuario.vehiculoAsociado+"\npeso: "+usuario.peso+"\n");
                }
            }
        }        
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void usuariosMayores(Scanner scanner, EmpresaTransporte empresa){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        scanner.nextLine();
        int edad=0;
        System.out.println("ingrese la edad:");
        edad=scanner.nextInt();
        System.out.println("los usuarios que superan "+edad+" de edad son:");

        for(VehiculoTransporte vehiculo:empresa.vehiculosTransporte){
            for(Usuario usuario:vehiculo.usuariosAsociados){
                if(edad<usuario.edad){
                    System.out.println("nombre: "+usuario.nombre+"\nvehiculo: "+usuario.vehiculoAsociado+"\nedad: "+usuario.edad+"\n");
                }
            }
        }        
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void agregarUsuario(Scanner scanner, EmpresaTransporte empresa){
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        scanner.nextLine();

        String placa = null;
        VehiculoTransporte aux=new VehiculoTransporte(null, null, null, null, null, 0);
        boolean existe=false;

        System.out.println("digite el numero de placa de vehiculo de transporte");
        placa=scanner.nextLine();
        for(VehiculoTransporte vehiculoTransporte:empresa.vehiculosTransporte){
            if(vehiculoTransporte.placa.equals(placa)){
                    aux=vehiculoTransporte;
                    existe=true;
            }
        }

        if(existe==true){
            Usuario usuario=new Usuario(null, 0, 0, placa);
            System.out.println("digite nombre de usuario");
            usuario.nombre=scanner.nextLine();
            System.out.println("digite edad de usuario");
            usuario.edad=scanner.nextInt();
            System.out.println("digite peso de usuario");
            usuario.peso=scanner.nextInt();            
            empresa.vehiculosTransporte.remove(aux);
            aux.usuariosAsociados.add(usuario);
            empresa.vehiculosTransporte.add(aux);
        }else{
            System.out.println("el vehiculo no existe en la empresa.");
        }
        scanner.nextLine();
    }

    public static void chao() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("                     █████████");
        System.out.println("  ███████          ███▒▒▒▒▒▒▒▒███");
        System.out.println("  █▒▒▒▒▒▒█       ███▒▒▒▒▒▒▒▒▒▒▒▒▒███");
        System.out.println("   █▒▒▒▒▒▒█    ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██");
        System.out.println("    █▒▒▒▒▒█   ██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███");
        System.out.println("     █▒▒▒█   █▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██");
        System.out.println("   █████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██");
        System.out.println("   █▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██");
        System.out.println(" ██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██");
        System.out.println("██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██");
        System.out.println("█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██");
        System.out.println("██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██");
        System.out.println(" █▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██");
        System.out.println(" ██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█");
        System.out.println("  ████████████   █████████████████");
        System.out.println("            Feliz dia");
    }      
}