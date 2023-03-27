package sfcmfc;

import java.util.ArrayList;
import java.util.Scanner;

public class SFCMFC {
    static ArrayList<Persona> listapersonas = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<Materia> SOF = new ArrayList();
    static ArrayList<Materia> SIS = new ArrayList();
    static ArrayList<Materia> TIC = new ArrayList();
    static ArrayList<Materia> NET = new ArrayList();
    static String negro = " \u001B[30m";
    static String rojo = " \u001B[31m";
    static String verde = " \u001B[32m";
    static String amarillo = " \u001B[33m";
    static String azul = " \u001B[34m";
    static String morado = " \u001B[35m";
    static String celeste = " \u001B[36m";    
      
    
    public static void main(String[] args) {
           
              
        SOFWARE();
        TICS();
        NETWORKING();
        SISTEMAS();
        
        Menu();
    }
    
    public static void LOGO(){
          System.out.println(" -----------------------------------------------------");
        System.out.println("|"+azul+"   #####  ######  ######  ##    ##  ######  ###### "+negro+"|");
        System.out.println("|"+azul+"  ######  ######  ######  ##    ##  ######  ###### "+negro+"|");
        System.out.println("|"+azul+"   ###    ##      ##      ###  ###  ##      ##     "+negro+"|");
        System.out.println("|"+azul+"    ###   ####    ##      ########  ####    ##     "+negro+"|");
        System.out.println("|"+azul+"     ###  ####    ##      ## ## ##  ####    ##     "+negro+"|");
        System.out.println("|"+azul+"  ######  ##      ######  ##    ##  ##      ###### "+negro+"|");
        System.out.println("|"+azul+"  #####   ##      ######  ##    ##  ##      ###### "+negro+"|");
             System.out.println(" -----------------------------------------------------");
    
    
    }
    // PRINCIPALES
    
    public static void Menu()
    {
        int op=0;
        
        do{            
            try{
            LOGO();            
            System.out.println(verde+"                  1"+negro+". Iniciar Sesion");
            System.out.println(verde+"                  2"+negro+". Registrarse");
            System.out.println(verde+"                  3"+negro+". Salir");
            System.out.println("");
            System.out.print("                    Opcion: ");
            op = sc.nextInt(); 
            sc.nextLine(); 
            }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO ENTRE 1 Y 3...");   
                Pulsar();
            }
        }while((op < 1) || (op > 3));
        
        switch (op){
            case 1:
                InicioSesion(); break;
            case 2:
                Registrarse(); break;
            case 3:
                System.exit(0);
                 break;
        }
    }
    
    public static void Registrarse()
    {
        int op=0;
        do{
            try{
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println(" --------------------------------------------------------");
            System.out.println("|"+azul+" ####   #####  #####  #####  ###  #####  ####   ##### "+negro+"|");
            System.out.println("|"+azul+" #   #  #      #        #   #       #    #   #  #   # "+negro+"|");
            System.out.println("|"+azul+" #   #  ###    #        #    #      #    #   #  #   # "+negro+"|");
            System.out.println("|"+azul+" ####   ###    # ###    #     #     #    ####   #   # "+negro+"|");
            System.out.println("|"+azul+" #  #   #      #   #    #      #    #    #  #   #   # "+negro+"|");
            System.out.println("|"+azul+" #   #  #####  #####  ##### ###     #    #   #  ##### "+negro+"|");            
            System.out.println(" --------------------------------------------------------");                        
            System.out.println(verde+"                  1"+negro+". Estudiante");
            System.out.println(verde+"                  2"+negro+". Profesor");
            System.out.println(verde+"                  3"+negro+". Secretaria");
            System.out.println(verde+"                  4"+negro+". Conserje");
            System.out.println(verde+"                  5"+negro+". Regresar al Menu");
            System.out.println("");
            System.out.print("             Opcion: ");
            op = sc.nextInt(); 
            }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO ENTERO..."+negro);   
                Pulsar();
            }
        }while((op < 1) || (op > 5));
        
        if(op == 5){
            Menu();}
        else{                
        sc.nextLine();
        
        switch (op){
            
            // REGISTRO DE ESTUDIANTE
            case 1:
                regEstudiante();               
                break;
            
            // REGISTRO DE PROFESOR
            case 2:
                regProfesor();             
                break;
            
            // REGISTRO DE SECRETARIA
            case 3:
                regSecretaria();
                break;
            
            // REGISTRO DE CONSERJE
            case 4:
                regConserje();
                break;
            }
        }
        Menu();
    }

    public static void InicioSesion()
    {
        String user, pass;
        int i;
        boolean auxcedula = false, auxpass = false ;
        
        while(true){
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println(" -------------------------------------------------------------------------------------------");
            System.out.println("|"+azul+" #####  #    #  #####  #####  #####  #####        ###  #####   ###  #####  #####  #    # "+negro+"|");
            System.out.println("|"+azul+"   #    ##   #    #    #        #    #   #       #     #      #       #    #   #  ##   # "+negro+"|");
            System.out.println("|"+azul+"   #    # #  #    #    #        #    #   #        #    ###     #      #    #   #  # #  # "+negro+"|");
            System.out.println("|"+azul+"   #    #  # #    #    #        #    #   #         #   ###      #     #    #   #  #  # # "+negro+"|");
            System.out.println("|"+azul+"   #    #   ##    #    #        #    #   #          #  #         #    #    #   #  #   ## "+negro+"|");
            System.out.println("|"+azul+" #####  #    #  #####  #####  #####  #####       ###   #####  ###   #####  #####  #    # "+negro+"|");            
            System.out.println(" -------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.print("                              Usuario(CI): ");
            user = sc.nextLine(); 
            System.out.print("                              Contraseña: ");
            pass = sc.nextLine(); 
            System.out.println("");
            
            for( i=0;i<listapersonas.size();i++)
            {                            
                if (user.equals(listapersonas.get(i).getCedula())){
                    auxcedula = true;
                    if(pass.equals(listapersonas.get(i).getContraseña())){
                        auxpass = true;                        
                        break;
                    }
                }
            }
            
            if(auxcedula){
                if(auxpass){
                    switch (listapersonas.get(i).getRol()){
                        case 1:
                            MenuEstudiante(i); break;
                        case 2:
                            MenuProfesor(i); break;
                        case 3:
                            MenuSecretaria(i); break;
                        case 4:
                            MenuConserje(i); break;
                    }
                    break;
                } else{  
                    System.out.println(" *CONTRASEÑA INCORRECTA*");
                    Pulsar();}
                    Menu(); break; 
            }else{
                System.out.println(" *USUARIO NO REGISTRADO*");  
                Pulsar();}
                Menu(); break;             
        }
    }
    
    

    // MENUS
    
    public static void MenuEstudiante(int i)
    {
        int op=0;
        do{
            try{
                System.out.println("\n\n\n\n\n");
                System.out.println(" ------------------------------------------------------------------------");
                System.out.println("|"+azul+"                     #    #  ##### #   # #   #                        "+negro+"|");
                System.out.println("|"+azul+"                     ##  ##  #     #   # #   #                        "+negro+"|");
                System.out.println("|"+azul+"                     # ## #  ###   ##  # #   #                        "+negro+"|");
                System.out.println("|"+azul+"                     #    #  ###   # # # #   #                        "+negro+"|");
                System.out.println("|"+azul+"                     #    #  #     #  ## #   #                        "+negro+"|");
                System.out.println("|"+azul+"                     #    #  ##### #   # #####                        "+negro+"|");   
                System.out.println("|                                                                        |");
                System.out.println("|"+azul+" #####   ###  #####  #   #  ####   #####   ###   #    #  #####  ##### "+negro+"|");
                System.out.println("|"+azul+" #      #       #    #   #  #   #    #    #   #  ##   #    #    #     "+negro+"|");
                System.out.println("|"+azul+" ###     #      #    #   #  #   #    #    #   #  # #  #    #    ###   "+negro+"|");
                System.out.println("|"+azul+" ###      #     #    #   #  #   #    #    #####  #  # #    #    ###   "+negro+"|");
                System.out.println("|"+azul+" #         #    #    #   #  #   #    #    #   #  #   ##    #    #     "+negro+"|");
                System.out.println("|"+azul+" #####  ###     #    #####  ####   #####  #   #  #    #    #    ##### "+negro+"|");
                System.out.println(" -------------------------------------------------------------------------");                
                System.out.println(verde+"                  1"+negro+". Consultar mis datos personales");
                System.out.println(verde+"                  2"+negro+". Consultar Calificaciones");              
                System.out.println(verde+"                  3"+negro+". Cerrar Sesion");
                System.out.println("");
                System.out.print("      Opcion: ");
                op = sc.nextInt(); 
                }catch(Exception e){
                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                        sc.nextLine();
                    }
        }while((op < 1) || (op > 3));
        
        switch (op){
            case 1:
                ConsultaDatos(i); 
                MenuEstudiante(i); 
                break;
                
            case 2:
                ConsultaAlumno(i,1,i, false); 
                MenuEstudiante(i); 
                break;
            case 3:
                Menu(); break;
        }         
    }
    
    public static void MenuProfesor(int i)
    {
        int op=0;
        do{
            try{
            System.out.println("\n\n\n\n\n");
                System.out.println(" --------------------------------------------------------");
                System.out.println("|"+azul+"               #    #  ##### #   # #   #              "+negro+"|");
                System.out.println("|"+azul+"               ##  ##  #     #   # #   #              "+negro+"|");
                System.out.println("|"+azul+"               # ## #  ###   ##  # #   #              "+negro+"|");
                System.out.println("|"+azul+"               #    #  ###   # # # #   #              "+negro+"|");
                System.out.println("|"+azul+"               #    #  #     #  ## #   #              "+negro+"|");
                System.out.println("|"+azul+"               #    #  ##### #   # #####              "+negro+"|");   
                System.out.println("|                                                                        |");
                System.out.println("|"+azul+" ####   ####   #####  ##### #####   ###  #####  ####  "+negro+"|");
                System.out.println("|"+azul+" #   #  #   #  #   #  #     #      #     #   #  #   # "+negro+"|");
                System.out.println("|"+azul+" #   #  #   #  #   #  ###   ###     #    #   #  #   # "+negro+"|");
                System.out.println("|"+azul+" ####   ####   #   #  ###   ###      #   #   #  ####  "+negro+"|");
                System.out.println("|"+azul+" #      #  #   #   #  #     #         #  #   #  #  #  "+negro+"|");
                System.out.println("|"+azul+" #      #   #  #####  #     #####  ###   #####  #   # "+negro+"|");
                System.out.println(" --------------------------------------------------------");                                                
                System.out.println(verde+"          1"+negro+". Consultar mis datos personales");
                System.out.println(verde+"          2"+negro+". Ingresar Calificaciones");
                System.out.println(verde+"          3"+negro+". Modificar Calificaciones");
                System.out.println(verde+"          4"+negro+". Consultar Calificaciones por Alumno");
                System.out.println(verde+"          5"+negro+". Consultar Acta de Calificaciones");
                System.out.println(verde+"          6"+negro+". Verificar Aprobacion de Actas");
                System.out.println(verde+"          7"+negro+". Cerrar Sesion");                
                System.out.println("");
                System.out.print("  Opcion: ");
                op = sc.nextInt(); 
            }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO ENTERO...");   
                Pulsar();
            }
        }while((op < 1) || (op > 7));
        
        switch (op){
            case 1:
                ConsultaDatos(i); break;
            case 2:
                IngresoCalif(i); break;
            case 3:
                ModificarCalif(i); break;
            case 4:
                ConsultaAlumno1(2,i,false); break;
            case 5:
                ConsultaActa(i, false); break; 
            case 6:
                VerificarAp(i); break;    
            case 7:
                Menu(); break;
        }
        MenuProfesor(i); 
    }
    
    public static void MenuSecretaria(int i)
    {
        int op=0;
        do{ 
            try{
            System.out.println("\n\n\n\n\n");
                System.out.println(" ------------------------------------------------------------------------");
                System.out.println("|"+azul+"                     #    #  ##### #   # #   #                        "+negro+"|");
                System.out.println("|"+azul+"                     ##  ##  #     #   # #   #                        "+negro+"|");
                System.out.println("|"+azul+"                     # ## #  ###   ##  # #   #                        "+negro+"|");
                System.out.println("|"+azul+"                     #    #  ###   # # # #   #                        "+negro+"|");
                System.out.println("|"+azul+"                     #    #  #     #  ## #   #                        "+negro+"|");
                System.out.println("|"+azul+"                     #    #  ##### #   # #####                        "+negro+"|");   
            System.out.println("|                                                                        |");
            System.out.println("|"+azul+"  ###  #####  #####  ####   #####  #####   ###   ####   #####   ###   "+negro+"|");
            System.out.println("|"+azul+" #     #      #      #   #  #        #    #   #  #   #    #    #   #  "+negro+"|");
            System.out.println("|"+azul+"  #    ###    #      #   #  ###      #    #   #  #   #    #    #   #  "+negro+"|");
            System.out.println("|"+azul+"   #   ###    #      ####   ###      #    #####  ####     #    #####  "+negro+"|");
            System.out.println("|"+azul+"    #  #      #      #  #   #        #    #   #  #  #     #    #   #  "+negro+"|");
            System.out.println("|"+azul+" ###   #####  #####  #   #  #####    #    #   #  #   #  #####  #   #  "+negro+"|");
        System.out.println(" -------------------------------------------------------------------------");
            System.out.println(verde+"          1"+negro+". Consultar mis datos personales");
            System.out.println(verde+"          2"+negro+". Eliminar Calificaciones");
            System.out.println(verde+"          3"+negro+". Aprobar Actas");
            System.out.println(verde+"          4"+negro+". Consultar Calificaciones por Alumno");
            System.out.println(verde+"          5"+negro+". Consultar Acta de Calificaciones");
            System.out.println(verde+"          6"+negro+". Cerrar Sesion");
            System.out.println("");
                    System.out.print("          Opcion: ");
            op = sc.nextInt(); 
            }catch(Exception e){            
                pulsarenteros();
            }
        }while((op < 1) || (op > 6));
        
        switch (op){
            case 1:
                ConsultaDatos(i);  break;
            case 2:
                ConsultaAlumno1(3,i,true);  break;
            case 3:
                ConsultaActa(i,true); break;
            case 4:
                ConsultaAlumno1(3,i,false); break;
            case 5:
                ConsultaActa(i,false); break;    
            case 6:
                Menu(); break;
        } 
        MenuSecretaria(i); 
    }
    
    public static void MenuConserje(int i)
    {
        int op=0;
        do{
            try{
            System.out.println(" ----------------------------------------------------------");
            System.out.println("|"+azul+"               #    #  ##### #   # #   #                "+negro+"|");
            System.out.println("|"+azul+"               ##  ##  #     #   # #   #                "+negro+"|");
            System.out.println("|"+azul+"               # ## #  ###   ##  # #   #                "+negro+"|");
            System.out.println("|"+azul+"               #    #  ###   # # # #   #                "+negro+"|");
            System.out.println("|"+azul+"               #    #  #     #  ## #   #                "+negro+"|");
            System.out.println("|"+azul+"               #    #  ##### #   # #####                "+negro+"|"); 
            System.out.println("|                                                        |");
            System.out.println("|"+azul+" #####  #####  #    #   ###  #####  ####   #####  ##### "+negro+"|");
            System.out.println("|"+azul+" #      #   #  ##   #  #     #      #   #    #    #     "+negro+"|");
            System.out.println("|"+azul+" #      #   #  # #  #   #    ###    #   #    #    ###   "+negro+"|");
            System.out.println("|"+azul+" #      #   #  #  # #    #   ###    ####     #    ###   "+negro+"|");
            System.out.println("|"+azul+" #      #   #  #   ##     #  #      #  #   # #    #     "+negro+"|");
            System.out.println("|"+azul+" #####  #####  #    #  ###   #####  #   #   ##    ##### "+negro+"|");                                    
            System.out.println(" ----------------------------------------------------------");
            System.out.println(verde+"          1"+negro+". Consultar mis datos personales");
            System.out.println(verde+"          2"+negro+". Consultar Horario Semanal");
            System.out.println(verde+"          3"+negro+". Cerrar Sesion");
            System.out.println("");
                    System.out.print("          Opcion: ");
            op = sc.nextInt(); 
            }catch(Exception e){
            pulsarenteros();
            }
        }while((op < 1) || (op > 3));
        
        switch (op){
            case 1:
                ConsultaDatos(i); break;
            case 2:
                MostrarHorario(i); break;
            case 3:
                Menu(); break;
        } 
        MenuConserje(i);
    } 
    
    
    
    
    // ACTIVIDADES
    
    public static void IngresoCalif(int i)
    {           
        int op = 0, j, k, cod = 0, s, aux2=1, auxE=0, h, yaca=0,indice = -1,g=0;
        String ci, id;
        boolean aux=true;
        float calificaciones[];
        float a[] = new float[4];
        Persona prof = listapersonas.get(i);
        Profesor P = (Profesor) prof;                
        do{
                System.out.println("\n\n\n\n\n\n");                                    
                System.out.println("--------------------------------------------------------------------------------------------------");        
                System.out.println("|"+azul+"                             #####  #   #  #####  ####   #####   ###  #####                      "+negro+"|");
                System.out.println("|"+azul+"                               #    ##  #  #      #   #  #      ##    #   #                      "+negro+"|");
                System.out.println("|"+azul+"                               #    # # #  # ###  ####   ###     ##   #   #                      "+negro+"|");
                System.out.println("|"+azul+"                               #    #  ##  #   #  #  #   #        ##  #   #                      "+negro+"|");
                System.out.println("|"+azul+"                             #####  #   #  #####  #   #  #####  ###   #####                      "+negro+"|");
                System.out.println("|                                                                                                  |");
                System.out.println("|"+azul+" #####   ###   #      #####  #####  #####  #####   ###   #####  #####  #####  #   #  #####   ### "+negro+"|");
                System.out.println("|"+azul+" #      #   #  #        #    #        #    #      #   #  #        #    #   #  ##  #  #      ##   "+negro+"|");
                System.out.println("|"+azul+" #      #####  #        #    ###      #    #      #####  #        #    #   #  # # #  ###     ##  "+negro+"|");
                System.out.println("|"+azul+" #      #   #  #        #    #        #    #      #   #  #        #    #   #  #  ##  #        ## "+negro+"|");
                System.out.println("|"+azul+" #####  #   #  #####  #####  #      #####  #####  #   #  #####  #####  #####  #   #  #####  ###  "+negro+"|");
                System.out.println("--------------------------------------------------------------------------------------------------");
            // MUESTRA las materias del profesor
            System.out.println(morado+"SUS MATERIAS SON LAS SIGUIENTES"+negro);
            for(k = 0; k < P.getMaterias().size(); k++){
                System.out.print(" CARRERA ID:"+azul+P.getMaterias().get(k).getIdCarrera()+negro+"   SEMESTRE: "+azul+P.getMaterias().get(k).getSemestreMat()+negro);
                System.out.println("   CODIGO: "+azul+P.getMaterias().get(k).getCodigoMat()+negro+"   MATERIA: "+azul+P.getMaterias().get(k).getNombreMat()+negro);
            }
            do{
                try{
                System.out.println(" ");
                System.out.println("      1. Elegir la materia: ");
                System.out.println("      2. Volver al menu: ");
                  System.out.print("      Opcion: ");
                op =sc.nextInt();
                }catch(Exception e){
                System.out.println(rojo+" DEBE INGRESAR UN NUMERO..."+negro);
                sc.nextLine();
            }
            }while((op<1)||(op>2));
            if (op==1){
                sc.nextLine();
                System.out.print(azul+"     Ingrese el ID de la Carrera: "+negro);
                id = sc.nextLine();
                try{
                System.out.print(azul+"     Ingrese el CODIGO de la Materia: "+negro);
                cod = sc.nextInt();
                     }catch(Exception e){
                     pulsarenteros();
                }
                for(s = 0; s < P.getMaterias().size(); s++){
                    if(id.equals(P.getMaterias().get(s).getIdCarrera())){
                        if (cod==(P.getMaterias().get(s).getCodigoMat())){
                            // Busca los alumnos con esa materia y los imprime
                            System.out.println(morado+"\n    SUS ESTUDIANTES SON"+negro);
                            for(j = 0; j < listapersonas.size(); j++){
                                if ((listapersonas.get(j).getRol()) == 1){
                                    Persona es = listapersonas.get(j);
                                    Estudiante E1 = (Estudiante) es;                                    
                                    for(h=0;h<E1.getMaterias().size();h++){
                                        if (E1.getMaterias().get(h).getNombreMat().equals(P.getMaterias().get(s).getNombreMat())){
                                            System.out.println(" Cedula: "+azul+listapersonas.get(j).getCedula()+negro+" --> Estudiante"+azul+listapersonas.get(j).getApellido()+" "+listapersonas.get(j).getNombre()+negro);
                                            auxE=1;
                                        }              
                                    }
                                }
                            }
                            // si no se encontraron estudiantes en con esa materia
                            if (auxE==0) {
                                System.out.println(rojo+" ** NO HAY ESTUDIANTES REGISTRADOS **\n"+negro);
                                Pulsar();
                                sc.nextLine();
                                break;
                            // si enconto un estudiantes en con esa materia
                            }else{
                                sc.nextLine();
                                do{
                                    System.out.println(" ");
                                    System.out.print("  CI del Estudiante: ");
                                    ci = sc.nextLine();
                                    
                                    for(g = 0; g<listapersonas.size(); g++){
                                        if(ci.equals(listapersonas.get(g).getCedula())){
                                            if(listapersonas.get(g).getRol()==1){
                                            indice=g;                                            
                                            break;
                                            }
                                        }
                                    }
                                    if(indice!=g){
                                        System.out.println(rojo+" CI INCORRECTO!!!"+negro);
                                        Pulsar();
                                        aux2=0;
                                    }
                                    else{
                                    Persona est = listapersonas.get(indice);
                                    Estudiante E = (Estudiante) est;
                                    calificaciones = new float[4];
                                    for (h = 0; h < E.getMaterias().size(); h++) {
                                        if (E.getMaterias().get(h).getCodigoMat()==P.getMaterias().get(s).getCodigoMat()) {
                                            if (E.getMaterias().get(h).getCalificaciones()[3] != 0) {
                                                aux2 = 0;
                                                yaca = 1;
                                            } else {
                                                do {
                                                    try{
                                                        System.out.print(verde+" Parcial 1: "+negro);
                                                        calificaciones[0] = sc.nextFloat();
                                                     }catch(Exception e){
                                                       System.out.println(rojo+"  DEBE INGRESAR UN NUMERO..."+negro);
                                                        sc.nextLine();
                                                     }    
                                                } while ((calificaciones[0] < 1) || (calificaciones[0] > 10));
                                                do {
                                                    try{
                                                        System.out.print(verde+" Parcial 2: "+negro);
                                                        calificaciones[1] = sc.nextFloat();
                                                    }catch(Exception e){
                                                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO..."+negro);
                                                        sc.nextLine();
                                                    }
                                                } while ((calificaciones[1] < 1) || (calificaciones[1] > 10));
                                                do {
                                                    try{
                                                        System.out.println(morado+" ¿Desea ingresar nota de Recuperacion?"+negro);
                                                        System.out.println("       1. Si             2.No");
                                                        System.out.print(" Opcion: ");
                                                        op = sc.nextInt();
                                                    }catch(Exception e){
                                                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO..."+negro);
                                                        sc.nextLine();
                                                     }    
                                                } while ((op < 1) || (op > 2));
                                                if (op == 1) {
                                                    do {
                                                        try{
                                                            System.out.print(verde+" Nota de recuperación: "+negro);
                                                            calificaciones[2] = sc.nextFloat();
                                                        }catch(Exception e){
                                                            System.out.println(rojo+"  DEBE INGRESAR UN NUMERO..."+negro);
                                                            sc.nextLine();
                                                        }    
                                                    } while ((calificaciones[2] < 1) || (calificaciones[2] > 10));
                                                    if ((calificaciones[2] > calificaciones[0]) && (calificaciones[0] > calificaciones[1])) {
                                                        calificaciones[1] = calificaciones[2];
                                                    } else if ((calificaciones[2] > calificaciones[1]) && (calificaciones[1] > calificaciones[0])) {
                                                        calificaciones[0] = calificaciones[2];
                                                    }
                                                } else {
                                                    calificaciones[2] = 0;
                                                }
                                                calificaciones[3] = E.getMaterias().get(h).CalcularNf(calificaciones[0], calificaciones[1]);
                                                // Guarda las calificaciones en el estudiante
                                                E.getMaterias().get(h).setCalificaciones(calificaciones);
                                                listapersonas.set(indice, E);                                                
                                                aux2 = 0;
                                                break;
                                            }
                                        }
                                    }
                                        if (yaca == 1) {
                                            System.out.println(rojo+" ** EL ESTUDIANTE YA TIENE CALIFICACIONES ** "+negro);
                                            Pulsar();
                                            break;
                                        }
                                    }
                                }while (aux2 == 1);
                                aux = false;
                            }
                        }
                    }
                }
            }else{                
                MenuProfesor(i);
                aux=false;
            }
        }while(aux  = true);   
    }    
    
    
    public static void ConsultaDatos(int i)
    {
        System.out.println("\n\n\n\n\n\n");
          System.out.println("--------------------------------------");
          System.out.println("|"+azul+" ####    ###   #####  #####   ### "+negro+"|");
          System.out.println("|"+azul+" #   #  #   #    #    #   #  #    "+negro+"|");
          System.out.println("|"+azul+" #   #  #   #    #    #   #   #   "+negro+"|");
          System.out.println("|"+azul+" #   #  #####    #    #   #    #  "+negro+"|");
          System.out.println("|"+azul+" #   #  #   #    #    #   #     # "+negro+"|");
          System.out.println("|"+azul+" ####   #   #    #    #####  ###  "+negro+"|");
          System.out.println("--------------------------------------");
        System.out.println(" Nombre: "+azul+listapersonas.get(i).getNombre()+negro);
        System.out.println(" Apellidos: "+azul+listapersonas.get(i).getApellido()+negro);
        System.out.println(" Cedula: "+azul+listapersonas.get(i).getCedula()+negro);
        System.out.println(" Edad: "+azul+listapersonas.get(i).getEdad()+negro);
        System.out.println(" Fecha de nacimiento: "+azul+listapersonas.get(i).getFechaNac().getDia()+"/"+listapersonas.get(i).getFechaNac().getMes()+"/"+listapersonas.get(i).getFechaNac().getYear()+negro);
        System.out.println(" Telefono: "+azul+listapersonas.get(i).getTelefono()+negro);
        System.out.println(" Direccion: "+azul+listapersonas.get(i).getDireccion()+negro);
        System.out.println(" Correo Electronico: "+azul+listapersonas.get(i).getCorreo()+negro);
        System.out.println(" Fecha de registro: "+azul+listapersonas.get(i).getFechaReg());
        
        switch (listapersonas.get(i).getRol()){
            case 1:
                System.out.println(" ");
                Persona est = listapersonas.get(i);
                Estudiante A = (Estudiante) est;
                System.out.print(negro+" Carrera: "+azul+A.getCarrera()+negro);
                System.out.print(" Semestre: "+azul+A.getSemestre()+negro);
                System.out.println(morado+"\n ***MATERIAS*** "+negro);
                for(i = 0; i < A.getMaterias().size(); i++){
                    System.out.println(" "+A.getMaterias().get(i).getCodigoMat()+azul+" : "+negro+A.getMaterias().get(i).getNombreMat());
                }
                               
                break;

            case 2:
                System.out.println(" ");
                Persona prof = listapersonas.get(i);
                Profesor P = (Profesor) prof;                           
                for(i = 0; i < P.getMaterias().size(); i++){
                    System.out.print(" CARRERA:"+azul+P.getMaterias().get(i).getIdCarrera()+negro+" SEMESTRE: "+azul+P.getMaterias().get(i).getSemestreMat()+negro);
                    System.out.println(" MATERIA: "+P.getMaterias().get(i).getCodigoMat()+azul+" : "+negro+P.getMaterias().get(i).getNombreMat());
                }
                
                break;

            case 3:                        
                System.out.println(" ");
                Persona sec = listapersonas.get(i);
                Secretaria S = (Secretaria) sec;
                System.out.print(" Años de servicio: "+azul+S.getAñoServ()+negro);
                System.out.print(" Turno de trabajo: "+azul+S.getTurno()+negro);                
                break;

            case 4:
                System.out.println(" ");
                Persona con = listapersonas.get(i);
                Conserje C = (Conserje) con;
                System.out.print(" Años de servicio: "+C.getAñoServ());
                System.out.print(" Turno de trabajo: "+C.getTurno());              
                break;
        }
        sc.nextLine();
        Pulsar(); 
    }   
    
    public static void ConsultaProfe(int i,int k){
    int m=0,u=0; 
    String palabra=rojo+"REPROBADO"+negro;
        Persona est = listapersonas.get(i);
        Estudiante E = (Estudiante) est;
        Persona prof = listapersonas.get(k);
                    Profesor P = (Profesor) prof;
                    for(m = 0;m<P.getMaterias().size();m++){
                       for(u=0;u<E.getMaterias().size();u++){
                            if(E.getMaterias().get(u).getNombreMat().equals(P.getMaterias().get(m).getNombreMat())){
                            if(E.getMaterias().get(u).getCalificaciones()[3]>=7){
                            palabra=verde+"APROBADO"+negro;
                             }
                            else if((E.getMaterias().get(u).getCalificaciones()[3]<7)&&(E.getMaterias().get(u).getCalificaciones()[3]>0)){
                            palabra=rojo+"REPROBADO"+negro;
                            }
                            else if(E.getMaterias().get(u).getCalificaciones()[3]==0){
                            palabra=amarillo+"SIN NOTA"+negro;
                            }
                            System.out.println("");
                            System.out.println(" "+E.getMaterias().get(u).getCodigoMat()+". "+E.getMaterias().get(u).getNombreMat()+"  -  "+palabra);
                            System.out.println("  PARCIAL 1 = "+azul+E.getMaterias().get(u).getCalificaciones()[0]+negro+"  |  PARCIAL 2 = "+azul+E.getMaterias().get(u).getCalificaciones()[1]+negro+"  |  PROMEDIO = "+azul+E.getMaterias().get(u).getCalificaciones()[3]+negro);                      
                            }                       
                       }                    
                    }
    
    }        
    
    
    public static void ConsultaAlumno(int i, int rol, int k, boolean delete)
    {
        int m=0,u=0;
        Persona est = listapersonas.get(i);
        Estudiante E = (Estudiante) est;
        String palabra=rojo+"REPROBADO"+negro;
        for(int h=0;h<E.getMaterias().size();h++){
            if(E.getMaterias().get(h).getCalificaciones()[3]>=7){
                    palabra=verde+"APROBADO"+negro;
                 }
                else if((E.getMaterias().get(h).getCalificaciones()[3]<7)&&(E.getMaterias().get(h).getCalificaciones()[3]>0)){
                palabra=rojo+"REPROBADO"+negro;
                }
                else if(E.getMaterias().get(h).getCalificaciones()[3]==0){
                    palabra=amarillo+"SIN NOTA"+negro;
                }
            System.out.println("");
            System.out.println(" "+E.getMaterias().get(h).getCodigoMat()+". "+E.getMaterias().get(h).getNombreMat()+"  -  "+palabra);
            System.out.println("  PARCIAL 1 = "+E.getMaterias().get(h).getCalificaciones()[0]+"  |  PARCIAL 2 = "+E.getMaterias().get(h).getCalificaciones()[1]+"  |  PROMEDIO = "+E.getMaterias().get(h).getCalificaciones()[3]+negro);              
        }
        
        if(delete==true){
            EliminarCal(i,k,E);
        }else{
            switch(rol){
                case 1:
                    sc.nextLine();
                    Pulsar();
                    MenuEstudiante(i); break;                                    
                case 2:
                    sc.nextLine();
                    Pulsar();
                    MenuSecretaria(k); break;
            } 
        }
    }

    
    public static void ConsultaActa(int i, boolean Ap)
    {
        int op=0, j,h, k, aux2=1, cod=0, s, z, auxC=0, para=0, aux=0, mp=0;
        String ci, id;
        System.out.println("-------------------------------------");
        System.out.println(azul+"         CONSULTA ACTAS  "+negro);
        System.out.println("-------------------------------------");
        System.out.println(" ");
        
        switch(listapersonas.get(i).getRol()){
            // Si es profesor
            case 2:
                Persona prof = listapersonas.get(i);
                Profesor P = (Profesor) prof;
                // busca las materias del profesor
                for(k = 0; k < P.getMaterias().size(); k++){
                    
                    System.out.print(" CARRERA:"+azul+P.getMaterias().get(k).getIdCarrera()+negro+"   SEMESTRE: "+azul+P.getMaterias().get(k).getSemestreMat()+negro);
                    System.out.println("  MATERIA: "+azul+P.getMaterias().get(k).getNombreMat()+negro);
                    do{
                        try{
                        System.out.println(" Ver el acta de calificaciones");
                        System.out.println(" 1. Si     2.No");
                        op =sc.nextInt();
                        }catch(Exception e){
                            System.out.print(" INGRESE SOLO EL NUMERO 1 O EL 2....");
                            sc.nextLine();
                        }
                    }while((op<1)||(op>2));
                    
                    if(op==1){
                        System.out.println("          ACTA DE CALIFICACIONES   ");
                        System.out.println("-------------------------------------");
                        // materia, alumnos y sus calificaciones
                        System.out.println("  MATERIA: "+P.getMaterias().get(k).getNombreMat());
                        System.out.print(" ");
                        MostrarAlumnos(aux2,k,P);
                        sc.nextLine();
                        Pulsar();
                    }
                }
                MenuProfesor(i);
                break;
            



            // Si es secretaria
            case 3:                
                do{
                    // MUESTRA LOS PROFESORES
                    for(j = 0; j < listapersonas.size(); j++){
                        if ((listapersonas.get(j).getRol()==2)){
                            System.out.println(" "+listapersonas.get(j).getCedula()+" : "+listapersonas.get(j).getApellido()+" "+listapersonas.get(j).getNombre());
                        }
                    }
                    do{
                    try{
                        System.out.println(" 1. Volver al menu ");
                        System.out.println(" 2. Elegir profesor ");
                        System.out.print(" Opcion: ");
                        op = sc.nextInt();
                    }catch(Exception e){
                    System.out.print(rojo+" INGRESE SOLO EL NUMERO 1 O EL 2...."+negro);
                    sc.nextLine();
                    }
                    }while((op<1)||(op>2));
                    if (op==2){
                        sc.nextLine();
                        System.out.print(" CI del Profesor: ");
                        ci = sc.nextLine();
                        for(j = 0; j < listapersonas.size(); j++){
                            if ((listapersonas.get(j).getRol()) == 2){
                                if(ci.equals(listapersonas.get(j).getCedula())){
                                    Persona pro = listapersonas.get(j);
                                    Profesor P2 = (Profesor) pro;
                                    do{
                                        for(h=0;h<P2.getMaterias().size();h++){
                                            System.out.print(" CARRERA: "+azul+P2.getMaterias().get(h).getIdCarrera()+negro+"   SEMESTRE: "+azul+P2.getMaterias().get(h).getSemestreMat()+negro);
                                            System.out.println("   CODIGO: "+azul+P2.getMaterias().get(h).getCodigoMat()+negro+"   MATERIA: "+azul+P2.getMaterias().get(h).getNombreMat()+negro);                                            
                                        }
                                        do{
                                            try{
                                                System.out.println(" ");
                                                System.out.println(" 1. Elegir la materia: ");
                                                System.out.println(" 2. Elegir otro profesor: ");
                                                System.out.print(" Opcion: ");
                                                op =sc.nextInt();
                                            }catch(Exception e){
                                            System.out.print(" INGRESE SOLO EL NUMERO 1 O EL 2....");
                                            sc.nextLine();
                                            }
                                        }while((op<1)||(op>2));
                                        if (op==1){
                                            sc.nextLine();
                                            System.out.print(azul+" Ingrese el ID de la Carrera: "+negro);
                                            id = sc.nextLine();
                                            try{
                                            System.out.print(azul+" Ingrese el CODIGO de la Materia: "+negro);
                                            cod = sc.nextInt();
                                            }catch(Exception e){
                                                System.out.print(rojo+" USTED HA INGRESADO DATOS DE MANERA INCORRECTA..."+negro);
                                                sc.nextLine();
                                            }
                                            for(s = 0; s < P2.getMaterias().size(); s++){
                                                if(id.equals(P2.getMaterias().get(s).getIdCarrera())){
                                                    if (cod==(P2.getMaterias().get(s).getCodigoMat())){
                                                        mp=s;
                                                        System.out.println("          ACTA DE CALIFICACIONES   ");
                                                        System.out.println("-------------------------------------");
                                                        // materia, alumnos y sus calificaciones
                                                        System.out.println("  MATERIA: "+morado+P2.getMaterias().get(s).getNombreMat()+negro);
                                                        System.out.print(" ");
                                                        MostrarAlumnos(aux2,s,P2);
                                                    }
                                                }
                                            }
                                            if(Ap==true){
                                                auxC=1;
                                                AprobarActas(i, P2, j,mp);
                                                //para=1;
                                                break;
                                            }
                                        }else{
                                            para=1;   
                                        }
                                    }while(para==0);
                                }
                            }
                        }
                    }else{
                        MenuSecretaria(i); break; 
                    }
                }while(auxC==0);
                break;
        }
    }
    
    
    public static void ConsultaAlumno1(int rol, int k, boolean delete){
        String user;
        int c=0;
        boolean aux=false;
        // MUESTRA A TODOS LOS ESTUDIANTES 
        System.out.println(azul+"\n\n\n\n\n\n\n\n\n\n\n\n\n BIENVENIDO A CONSULTA ALUMNOS!!!!"+negro);
        for(int e = 0; e < listapersonas.size(); e++){
            if(listapersonas.get(e).getRol()==1){
                System.out.println(" Cedula: "+azul+listapersonas.get(e).getCedula()+negro+" ---> "+azul+listapersonas.get(e).getApellido()+" "+listapersonas.get(e).getNombre()+negro);
                c++;
            }
        }
        if(c==0){
            System.out.println(rojo+" NO HAY ESTUDIANTES REGISTRADOS..."+negro);
            if(listapersonas.get(k).getRol()==2){
                Pulsar();
                sc.nextLine();
                MenuProfesor(k);
            }
            else{
                Pulsar();
                sc.nextLine();
                MenuSecretaria(k);
            }
        }
        else{
            sc.nextLine();
            do{                
                System.out.print(" CI DEL ESTUDIANTE: ");
                user = sc.nextLine();
                // SI LA CEDULA COINCIDE, LE MUESTRA SUS NOTAS
                for(int e = 0; e < listapersonas.size(); e++){
                    if(user.equals(listapersonas.get(e).getCedula())){
                        if(listapersonas.get(e).getRol()==1){
                            if(rol==2){
                                ConsultaProfe(e, k);
                            }
                            else{
                            ConsultaAlumno(e, rol, k, delete);                 
                            }
                            aux=true;
                            
                        }
                       
                    }                
                }
            }while(aux==false);
        }
        Pulsar();
        sc.nextLine();
   }
    
    
    public static void EliminarCal(int i, int k, Estudiante E){
        int cod=0, op = 0; boolean aux=false;
        System.out.println(azul+"\n\n\n\n\n\n\n\n\n\n\n\n\n BIENVENIDO A ELIMINAR CALIFICACIONES!!!!"+negro);
        do{            
            System.out.println(" ");
            try{
            System.out.print(" CODIGO DE MATERIA: ");
            cod = sc.nextInt();
            }catch(Exception e){
                System.out.print(rojo+" SOLO SE ACEPTAN NUMEROS..."+negro);
                sc.nextLine();
            }
            // SI EL CODIGO COINCIDE
            for(int h=0;h<E.getMaterias().size();h++){
                if(cod==(E.getMaterias().get(h).getCodigoMat())){
                    System.out.println(" ");
                    float[] calificaciones = new float[4];
                    float[] calificaTemp = new float[4];
                    do{
                        try{
                        System.out.println(" Que nota desea ELIMINAR");
                        System.out.println(" 1. Nota del Parcial 1");
                        System.out.println(" 2. Nota del Parcial 2");
                        System.out.println(" 3. Nota de Recuperacion");
                        System.out.println(" 4. Cancelar");
                        System.out.print(" Opcion: ");
                        op = sc.nextInt();
                        }catch(Exception e){
                            System.out.println(rojo+"  DEBE INGRESAR UN NUMERO..."+negro);
                            sc.nextLine();
                        }
                    }while((op<1)||(op>4));
                    calificaTemp = E.getMaterias().get(h).getCalificaciones();
                    switch(op){
                        case 1:
                            calificaciones[0]=0;
                            calificaciones[1]=calificaTemp[1];
                            calificaciones[2]=calificaTemp[2];
                            calificaciones[3]=calificaTemp[3];
                            E.getMaterias().get(h).setCalificaciones(calificaciones);
                            listapersonas.set(i, E);
                            break;
                        case 2:
                            calificaciones[0]=calificaTemp[0];
                            calificaciones[1]=0;
                            calificaciones[2]=calificaTemp[2];
                            calificaciones[3]=calificaTemp[3];
                            E.getMaterias().get(h).setCalificaciones(calificaciones);
                            listapersonas.set(i, E);
                            break;
                        case 3:
                            calificaciones[0]=calificaTemp[0];
                            calificaciones[1]=calificaTemp[1];
                            calificaciones[2]=0;
                            calificaciones[3]=calificaTemp[3];
                            E.getMaterias().get(h).setCalificaciones(calificaciones);
                            listapersonas.set(i, E); 
                            break;
                        case 4:
                            aux=true;
                            MenuSecretaria(k);
                            break;
                    }
                    System.out.println(rojo+" ** SE HA ELIMINADO LA NOTA **"+negro);
                    Pulsar();
                    sc.nextLine();
                    MenuSecretaria(k);
                }
            }
        }while(aux==false);
    }
    
    public static void ModificarCalif(int i)
    {
        System.out.println("\n\n\n\n\n\n");                                    
        System.out.println("--------------------------------------------------------------------------------------------------");        
        System.out.println("|"+azul+"                 #    #  #####  ####   #####  #####  #####  #####   ###   #####                  "+negro+"|");
        System.out.println("|"+azul+"                 ##  ##  #   #  #   #    #    #        #    #      #   #  #   #                  "+negro+"|");
        System.out.println("|"+azul+"                 # ## #  #   #  #   #    #    ###      #    #      #####  ####                   "+negro+"|");
        System.out.println("|"+azul+"                 #    #  #   #  #   #    #    #        #    #      #   #  #   #                  "+negro+"|");
        System.out.println("|"+azul+"                 #    #  #####  ####   #####  #      #####  #####  #   #  #    #                 "+negro+"|");
        System.out.println("|                                                                                   |");
        System.out.println("|"+azul+" #####   ###   #      #####  #####  #####  #####   ###   #####  #####  #####  #   #  #####   ### "+negro+"|");
        System.out.println("|"+azul+" #      #   #  #        #    #        #    #      #   #  #        #    #   #  ##  #  #      ##   "+negro+"|");
        System.out.println("|"+azul+" #      #####  #        #    ###      #    #      #####  #        #    #   #  # # #  ###     ##  "+negro+"|");
        System.out.println("|"+azul+" #      #   #  #        #    #        #    #      #   #  #        #    #   #  #  ##  #        ## "+negro+"|");
        System.out.println("|"+azul+" #####  #   #  #####  #####  #      #####  #####  #   #  #####  #####  #####  #   #  #####  ###  "+negro+"|");
        System.out.println("--------------------------------------------------------------------------------------------------");
        int op = 0, cod=0, auxE=0, indice=-1, aux2=1,g=0, cal = 0;
        String id, ci;
        Persona prof = listapersonas.get(i);
        Profesor P = (Profesor) prof;
        
        for(int k = 0; k < P.getMaterias().size(); k++){
            System.out.print(negro+" CARRERA:"+azul+P.getMaterias().get(k).getIdCarrera()+negro+"   SEMESTRE: "+azul+P.getMaterias().get(k).getSemestreMat()+negro);
            System.out.println("   CODIGO: "+azul+P.getMaterias().get(k).getCodigoMat()+negro+"   MATERIA: "+azul+P.getMaterias().get(k).getNombreMat()+negro);
        }
            do{
                try{
                    System.out.println(" ");
                    System.out.println("       1. Elegir la materia: ");
                    System.out.println("       2. Volver al menu: ");
                      System.out.print("       Opcion: ");
                    op =sc.nextInt();
                }catch(Exception e){
                pulsarenteros();
                }
            }while((op<1)||(op>2));
            if (op==1){
                sc.nextLine();
                System.out.print(azul+"   Ingrese el ID de la Carrera: "+negro);
                id = sc.nextLine();
                try{
                    System.out.print(azul+"   Ingrese el CODIGO de la Materia: "+negro);
                    cod = sc.nextInt();
                }catch(Exception e){
                     pulsarenteros();
                }
                for(int s = 0; s < P.getMaterias().size(); s++){
                    if(id.equals(P.getMaterias().get(s).getIdCarrera())){
                        if (cod==(P.getMaterias().get(s).getCodigoMat())){
                            // Busca los alumnos con esa materia y los imprime
                            System.out.println(morado+" SUS ESTUDIANTES SON"+negro);
                            for(int j = 0; j < listapersonas.size(); j++){
                                if ((listapersonas.get(j).getRol()) == 1){
                                    Persona es = listapersonas.get(j);
                                    Estudiante E1 = (Estudiante) es;                                    
                                    for(int h=0;h<E1.getMaterias().size();h++){
                                        if (E1.getMaterias().get(h).getNombreMat().equals(P.getMaterias().get(s).getNombreMat())){
                                             System.out.println(" Cedula: "+azul+listapersonas.get(j).getCedula()+negro+" --> Estudiante"+azul+listapersonas.get(j).getApellido()+" "+listapersonas.get(j).getNombre()+negro);
                                            auxE=1;
                                        }              
                                    }
                                    
                                }
                            }
                            // si no se encontraron estudiantes en con esa materia
                            if (auxE==0) {
                                System.out.println(rojo+" ** NO HAY ESTUDIANTES REGISTRADOS **\n"+negro);
                                Pulsar();
                                sc.nextLine();
                                break;
                            // si enconto un estudiantes en con esa materia
                            }else{
                                sc.nextLine();
                                do{
                                    System.out.print(" CI del Estudiante: ");
                                    ci = sc.nextLine();
                                    for(g = 0; g<listapersonas.size(); g++){
                                        if(ci.equals(listapersonas.get(g).getCedula())){
                                            if(listapersonas.get(g).getRol()==1){
                                            indice=g;                                            
                                            break;
                                            }
                                        }
                                    }
                                    if(indice!=g){
                                        System.out.println(rojo+" CI INCORRECTO!!!"+negro);
                                        Pulsar();
                                        aux2=0;
                                    }
                                    else{
                                    Persona est = listapersonas.get(indice);
                                    Estudiante E = (Estudiante) est;
                                    for (int h = 0; h < E.getMaterias().size(); h++) {
                                        if (E.getMaterias().get(h).getCodigoMat()==P.getMaterias().get(s).getCodigoMat()) {
                                            if (E.getMaterias().get(h).getCalificaciones()[3] == 0) {
                                                System.out.println(rojo+" AUN NO SE HAN INGRESADO LAS CALIFICACIONES "+negro);
                                                Pulsar();
                                                aux2 = 0; break;
                                            } else {
                                                float[] calificaciones = new float[4];
                                                float[] calificaTemp = new float[4];
                                                do{
                                                    try{
                                                        System.out.println(morado+"      Que Calificacion desea MODIFICAR"+negro);
                                                        System.out.println("      1. Calificacion del Parcial 1");
                                                        System.out.println("      2. Calificacion del Parcial 2");
                                                        System.out.println("      3. Calificacion de Recuperacion");
                                                        System.out.println("      4. Cancelar");
                                                        System.out.print("        Opcion: ");
                                                        op = sc.nextInt();
                                                    }catch(Exception e){
                                                        pulsarenteros();
                                                    }
                                                }while((op<1)||(op>4));                                                
                                                calificaTemp[0] = E.getMaterias().get(h).getCalificaciones()[0];
                                                calificaTemp[1] = E.getMaterias().get(h).getCalificaciones()[1];
                                                calificaTemp[2] = E.getMaterias().get(h).getCalificaciones()[2];
                                                calificaTemp[3] = E.getMaterias().get(h).getCalificaciones()[3];
                                                switch(op){
                                                    case 1: 
                                                        if(calificaTemp[0]==0){
                                                        do {
                                                            try{
                                                            System.out.print(verde+" Ingrese la Calificacion Parcial 1: "+negro);
                                                            calificaciones[0] = sc.nextFloat();
                                                        }catch(Exception e){
                                                            pulsarenteros();
                                                        }
                                                        } while ((calificaciones[0] < 1) || (calificaciones[0] > 10));
                                                        calificaciones[1]=calificaTemp[1];
                                                        calificaciones[2]=calificaTemp[2];
                                                        cal=1;
                                                        System.out.println(azul+" ** SE HA MODIFICADO LA CALIFICACION **"+negro);
                                                        Pulsar();
                                                        }
                                                        else{
                                                            System.out.println("");
                                                            System.out.println(rojo+" LA CALIFICACIÓN DEBE SER ELIMINADA POR LA SECRETRIA"+negro);
                                                            sc.nextLine();
                                                            Pulsar();
                                                        }
                                                        break;
                                                    case 2:
                                                         if(calificaTemp[1]==0){
                                                        do {
                                                            try{
                                                               System.out.print(verde+" Ingrese la Calificacion Parcial 2: "+negro);
                                                               calificaciones[1] = sc.nextFloat();
                                                            }catch(Exception e){
                                                            pulsarenteros();
                                                        }
                                                        } while ((calificaciones[1] < 1) || (calificaciones[1] > 10));
                                                        calificaciones[0]=calificaTemp[0];
                                                        calificaciones[2]=calificaTemp[2];
                                                        cal=1;
                                                        System.out.println(azul+" ** SE HA MODIFICADO LA CALIFICACION **"+negro);
                                                        Pulsar();
                                                        }
                                                        else{
                                                            System.out.println("");
                                                            System.out.println(rojo+" LA CALIFICACIÓN DEBE SER ELIMINADA POR LA SECRETRIA"+negro);
                                                           sc.nextLine();
                                                            Pulsar();
                                                        }
                                                        break;
                                                    case 3:
                                                        if(calificaTemp[2]==0){
                                                        do {
                                                            try{
                                                            System.out.print(verde+" Ingrese la Calificacion de Recuperacion: "+negro);
                                                            calificaciones[2] = sc.nextFloat();
                                                            }catch(Exception e){
                                                            pulsarenteros();
                                                        }
                                                        } while ((calificaciones[2] < 1) || (calificaciones[2] > 10));
                                                        calificaciones[0]=calificaTemp[0];
                                                        calificaciones[1]=calificaTemp[1];
                                                        cal=1;
                                                        System.out.println(azul+" ** SE HA MODIFICADO LA CALIFICACION **"+negro);
                                                        sc.nextLine();
                                                            Pulsar();
                                                        }
                                                        else{
                                                            System.out.println("");
                                                            System.out.println(rojo+" LA CALIFICACIÓN DEBE SER ELIMINADA POR LA SECRETRIA"+negro);
                                                            sc.nextLine();
                                                            Pulsar();
                                                        }
                                                        break;
                                                    case 4:                                                        
                                                        break;
                                                }
                                                if(cal==1){    
                                                    if ((calificaciones[2] > calificaciones[0]) && (calificaciones[0] > calificaciones[1])) {
                                                        calificaciones[1] = calificaciones[2];
                                                    } else if ((calificaciones[2] > calificaciones[1]) && (calificaciones[1] > calificaciones[0])) {
                                                        calificaciones[0] = calificaciones[2];
                                                    }
                                                    calificaciones[3]=E.getMaterias().get(h).CalcularNf(calificaciones[0], calificaciones[1]);
                                                    E.getMaterias().get(h).setCalificaciones(calificaciones);
                                                    listapersonas.set(indice, E);
                                                    
                                                }
                                                aux2=0;
                                                break;
                                            }
                                        }
                                    }
                                    }
                                }while(aux2 == 1);
                            }
                        }
                    }
                }
            }
        MenuProfesor(i);
    }
    
    public static void AprobarActas(int i, Profesor P, int indice, int s)
    {
        System.out.println(azul+"\n\n\n\n\n\n\n\n\n\n\n APROBACION DE ACTAS!!!!!");
        int op = 0;
        do{
            try{
            System.out.println(" Aprobar Acta");
            System.out.println(" 1. Si");
            System.out.println(" 2. No");
            op=sc.nextInt();
            }catch(Exception e){
                System.out.println(rojo+" SOLO SE ACEPTAN NUMEROS..."+negro);
                sc.nextLine();
            }
        }while((op<1)||(op>2));
        
        if (op==1){
            P.getMaterias().get(s).setAprobActa(true);
            System.out.println(azul+" El ACTA ha sido APROBADA "+negro);
        }else{
            P.getMaterias().get(s).setAprobActa(false);
            System.out.println(rojo+" El ACTA NO ha sido APROBADA "+negro);
        }
        listapersonas.set(indice,P);
        MenuSecretaria(i);
    }
    
    public static void VerificarAp(int i){
        Persona prof = listapersonas.get(i);
        Profesor P = (Profesor) prof; 
        int c=0, k=0;
        for(int s=0;s<P.getMaterias().size();s++){
            if(P.getMaterias().get(s).isAprobActa()==true){
                System.out.println(" EL ACTA DE "+P.getMaterias().get(s).getNombreMat()+" HA SIDO APROBADA");
                c++;
            }
            k++;
        }
        if(c==0){
            System.out.println(" ** AUN NO SE HAN APROBADO LAS ACTAS **");
        }else{
            System.out.println(" ** FALTAN "+(k-c)+" ACTAS POR APROBAR **");
        } 
    }
    
    public static void MostrarHorario(int i){
        
        Persona con = listapersonas.get(i);
        Conserje C = (Conserje) con;
        
        switch(C.getTurno()){
            case "Matutino":
                System.out.println("                           HORARIO MATUTINO ");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("  Lunes        Martes        Miercoles        Jueves       Viernes  ");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("  07:00        07:00           07:00           07:00        07:00   ");
                System.out.println("  12:00        12:00           12:00           12:00        12:00   ");
                System.out.println("--------------------------------------------------------------------");
                break;
            case "Vespertino":   
                System.out.println("                           HORARIO VESPERTINO ");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("  Lunes        Martes        Miercoles        Jueves       Viernes  ");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("  12:00        12:00           12:00           12:00        12:00   ");
                System.out.println("  17:00        17:00           17:00           17:00        17:00   ");
                System.out.println("--------------------------------------------------------------------");
                break;
            case "Nocturno":    
                System.out.println("                           HORARIO NOCTURNO ");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("  Lunes        Martes        Miercoles        Jueves       Viernes  ");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("  17:00        17:00           17:00           17:00        17:00   ");
                System.out.println("  22:00        22:00           22:00           22:00        22:00   ");
                System.out.println("--------------------------------------------------------------------");
                break;
        }
    }
    
    //CARRERAS
    public static void Carreras(){
    System.out.println(" --------------------------------------------------------");
                System.out.println("|"+azul+"#####   ###   ####   ####   #####  ####    ###    ### "+negro+"|");
                System.out.println("|"+azul+"#      #   #  #   #  #   #  #      #   #  #   #  #    "+negro+"|");
                System.out.println("|"+azul+"#      #   #  #   #  #   #  ###    #   #  #   #   #   "+negro+"|");
                System.out.println("|"+azul+"#      #####  ####   ####   ###    ####   #####    #  "+negro+"|");
                System.out.println("|"+azul+"#      #   #  #  #   #  #   #      #  #   #   #     # "+negro+"|");
                System.out.println("|"+azul+"#####  #   #  #   #  #   #  #####  #   #  #   #  ###  "+negro+"|");            
                System.out.println(" --------------------------------------------------------");
    }
    
    // REGISTROS

    public static void regEstudiante(){
        Estudiante A = new Estudiante();
        Materia m;
        int  semestre = 0, op=0; boolean auxcedula=false;
        A.setRol(1);
        System.out.println("\n\n\n\n\n");
        System.out.println(" ------------------------------------------------------------------------");
            System.out.println("|"+azul+"         ####   #####  #####  #####  ###  #####  ####   #####         "+negro+"|");
            System.out.println("|"+azul+"         #   #  #      #        #   #       #    #   #  #   #         "+negro+"|");
            System.out.println("|"+azul+"         #   #  ###    #        #    #      #    #   #  #   #         "+negro+"|");
            System.out.println("|"+azul+"         ####   ###    # ###    #     #     #    ####   #   #         "+negro+"|");
            System.out.println("|"+azul+"         #  #   #      #   #    #      #    #    #  #   #   #         "+negro+"|");
            System.out.println("|"+azul+"         #   #  #####  #####  ##### ###     #    #   #  #####         "+negro+"|");   
            System.out.println("|                                                                        |");
            System.out.println("|"+azul+" #####   ###  #####  #   #  ####   #####   ###   #    #  #####  ##### "+negro+"|");
            System.out.println("|"+azul+" #      #       #    #   #  #   #    #    #   #  ##   #    #    #     "+negro+"|");
            System.out.println("|"+azul+" ###     #      #    #   #  #   #    #    #   #  # #  #    #    ###   "+negro+"|");
            System.out.println("|"+azul+" ###      #     #    #   #  #   #    #    #####  #  # #    #    ###   "+negro+"|");
            System.out.println("|"+azul+" #         #    #    #   #  #   #    #    #   #  #   ##    #    #     "+negro+"|");
            System.out.println("|"+azul+" #####  ###     #    #####  ####   #####  #   #  #    #    #    ##### "+negro+"|");
        System.out.println(" -------------------------------------------------------------------------");
        System.out.print(verde+" Nombres: ");
        A.setNombre(sc.nextLine());
        System.out.print(verde+" Apellidos: ");
        A.setApellido(sc.nextLine());
        do{
            auxcedula = false;
            System.out.print(verde+" Cedula: ");
            A.setCedula(sc.nextLine());
            if (!listapersonas.isEmpty()){
                for( int k = 0;k < listapersonas.size();k++){                            
                    if (A.getCedula().equals(listapersonas.get(k).getCedula())){
                        auxcedula = true;
                        System.out.println(rojo+" **** CEDULA YA REGISTRADA **** ");
                    }
                }
            }
        }while(auxcedula == true);
        do{
            try{
                System.out.print(verde+" Edad: ");
                A.setEdad(sc.nextInt()); 
                }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                sc.nextLine();
            }
        }while((A.getEdad()<16)||(A.getEdad()>65));
            
        A.setFechaNac(FechaNac());
        sc.nextLine();
        System.out.print(verde+" Telefono: ");        
        A.setTelefono(sc.nextLine());
        System.out.print(verde+" Direccion: ");        
        A.setDireccion(sc.nextLine());
        System.out.print(verde+" Correo Electronico: ");
        A.setCorreo(sc.nextLine());
        System.out.print(verde+" Contraseña: ");   
        A.setContraseña(sc.nextLine());
        
        do{
            try{
                Carreras();

                System.out.println("");
                System.out.println(verde+"  1"+negro+". Ingenieria en Software");
                System.out.println(verde+"  2"+negro+". Ingenieria en Sistemas Computacionales");
                System.out.println(verde+"  3"+negro+". Ingenieria en Tecnologias de la Informacion");
                System.out.println(verde+"  4"+negro+". Ingenieria en Networking");
                System.out.println("");
                System.out.print("  Opcion: ");
                op = sc.nextInt(); 
            }catch(Exception e){
                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                        sc.nextLine();
                    }
        }while((op < 1) || (op > 4));
                
        switch (op){
            case 1:                
                A.setCarrera("INGENIERIA EN SOFTWARE");
                do{
                    try{
                        System.out.print(morado+" ¿Cual es su semestre actual de SOFTWARE?: ");
                        semestre = sc.nextInt();
                    }catch(Exception e){
                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                        sc.nextLine();
                    }
                }while((semestre<1) || (semestre>10));
                A.setSemestre(semestre); 
                System.out.println(" ");                
                for(int i = 0;i < SOF.size(); i++){
                    if(SOF.get(i).getSemestreMat() == A.getSemestre()){
                    String a = SOF.get(i).getNombreMat();
                    int b = SOF.get(i).getCodigoMat();
                    int c = SOF.get(i).getSemestreMat();
                    String d = SOF.get(i).getIdCarrera();
                    A.getMaterias().add(new Materia(a, b, c, d));
                    }                                    
                }
                MostrarMatEst(A);
                break;
            case 2:
                A.setCarrera("INGENIERIA SISTEMAS COMPUTACIONALES");
                do{
                    try{
                        System.out.print(morado+" ¿Cual es su semestre actual de SISTEMAS COMPUTACIONALES?: ");
                        semestre = sc.nextInt();
                    }catch(Exception e){
                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                        sc.nextLine();
                    }           
                }while((semestre<1) || (semestre>8));
                A.setSemestre(semestre);                
                for(int i = 0;i < SIS.size(); i++){
                    if(SIS.get(i).getSemestreMat() == A.getSemestre()){
                         m = new Materia(SIS.get(i).getNombreMat(),SIS.get(i).getCodigoMat(),SIS.get(i).getSemestreMat(),SIS.get(i).getIdCarrera());                         
                         A.getMaterias().add(m);                          
                    }                                    
                }
                MostrarMatEst(A);
                break;
            case 3:
                A.setCarrera("INGENIERIA EN TECNOLOGIAS DE LA INFORMACION");
                do{
                    try{
                        System.out.print(morado+" ¿Cual es su semestre actual de TECNOLOGIAS DE LA INFORMACION?: ");
                        semestre = sc.nextInt();
                    }catch(Exception e){
                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                        sc.nextLine();
                    }           
                }while((semestre<1) || (semestre>10));
                A.setSemestre(semestre);                
                for(int i = 0;i < TIC.size(); i++){
                    if(TIC.get(i).getSemestreMat() == A.getSemestre()){
                         m = new Materia(TIC.get(i).getNombreMat(),TIC.get(i).getCodigoMat(),TIC.get(i).getSemestreMat(),TIC.get(i).getIdCarrera());                         
                         A.getMaterias().add(m);                          
                    }                                    
                }
                MostrarMatEst(A);
                break;
            case 4:
                A.setCarrera("INGENIERIA EN NETWORKING");
                do{
                    try{
                        System.out.print(morado+" ¿Cual es su semestre actual de NETWORKING?: ");
                        semestre = sc.nextInt();
                    }catch(Exception e){
                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                        sc.nextLine();
                    }          
                }while((semestre<1) || (semestre>10));
                A.setSemestre(semestre);                
                for(int i = 0;i < NET.size(); i++){
                    if(NET.get(i).getSemestreMat() == A.getSemestre()){
                         m = new Materia(NET.get(i).getNombreMat(),NET.get(i).getCodigoMat(),NET.get(i).getSemestreMat(),NET.get(i).getIdCarrera());                         
                         A.getMaterias().add(m);                          
                    }                                    
                }
                MostrarMatEst(A);
                break;
        }
        listapersonas.add(A);
        for(int i=0; i<listapersonas.size(); i++){
            if(listapersonas.get(i).getCedula().contains(A.getCedula())){                
                listapersonas.get(i).setFechaReg(listapersonas.get(i).RegistrarIngreso());
            }
        }
        Pulsar();
        System.out.print("\n\n\n\n\n\n\n\n"); 
    }
    
    public static void regProfesor(){
        Profesor P = new Profesor();
        int semestre = 0, op=0;
        boolean aux=true, auxcedula=false; 
        P.setRol(2);
        System.out.println("\n\n\n\n\n");
        System.out.println(" --------------------------------------------------------");
            System.out.println("|"+azul+" ####   #####  #####  #####  ###  #####  ####   ##### "+negro+"|");
            System.out.println("|"+azul+" #   #  #      #        #   #       #    #   #  #   # "+negro+"|");
            System.out.println("|"+azul+" #   #  ###    #        #    #      #    #   #  #   # "+negro+"|");
            System.out.println("|"+azul+" ####   ###    # ###    #     #     #    ####   #   # "+negro+"|");
            System.out.println("|"+azul+" #  #   #      #   #    #      #    #    #  #   #   # "+negro+"|");
            System.out.println("|"+azul+" #   #  #####  #####  ##### ###     #    #   #  ##### "+negro+"|");   
            System.out.println("|                                                        |");
            System.out.println("|"+azul+" ####   ####   #####  ##### #####   ###  #####  ####  "+negro+"|");
            System.out.println("|"+azul+" #   #  #   #  #   #  #     #      #     #   #  #   # "+negro+"|");
            System.out.println("|"+azul+" #   #  #   #  #   #  ###   ###     #    #   #  #   # "+negro+"|");
            System.out.println("|"+azul+" ####   ####   #   #  ###   ###      #   #   #  ####  "+negro+"|");
            System.out.println("|"+azul+" #      #  #   #   #  #     #         #  #   #  #  #  "+negro+"|");
            System.out.println("|"+azul+" #      #   #  #####  #     #####  ###   #####  #   # "+negro+"|");
        System.out.println(" --------------------------------------------------------");
        System.out.print(verde+" Nombres: ");
        P.setNombre(sc.nextLine());
        System.out.print(verde+" Apellidos: ");
        P.setApellido(sc.nextLine());
        do{
            auxcedula = false;
            System.out.print(verde+" Cedula: ");
            P.setCedula(sc.nextLine());
            if (!listapersonas.isEmpty()){
                for( int k = 0;k < listapersonas.size();k++){                            
                    if (P.getCedula().equals(listapersonas.get(k).getCedula())){
                        auxcedula = true;
                        System.out.println(rojo+" **** CEDULA YA REGISTRADA **** ");
                    }
                }
            }
        }while(auxcedula == true);
        do{
            try{
                System.out.print(verde+" Edad: ");
                P.setEdad(sc.nextInt()); 
                }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                sc.nextLine();
            }
        }while((P.getEdad()<22)||(P.getEdad()>65));
            
        P.setFechaNac(FechaNac());
        sc.nextLine();
        System.out.print(verde+" Telefono: ");        
        P.setTelefono(sc.nextLine());
        System.out.print(verde+" Direccion: ");        
        P.setDireccion(sc.nextLine());
        System.out.print(verde+" Correo Electronico: ");
        P.setCorreo(sc.nextLine());
        System.out.print(verde+" Contraseña: ");   
        P.setContraseña(sc.nextLine());
        // REGISTRO MATERIAS DEL PROFESOR
        do{
            do{
                try{
                    Carreras();
                    System.out.println("");
                    System.out.println(verde+"  1"+negro+". Ingenieria en Software");
                    System.out.println(verde+"  2"+negro+". Ingenieria en Sistemas Computacionales");
                    System.out.println(verde+"  3"+negro+". Ingenieria en Tecnologias de la Informacion");
                    System.out.println(verde+"  4"+negro+". Ingenieria en Networking");
                    System.out.println(verde+"  5"+negro+". Terminar y volver al menú");
                    System.out.println("");
                    System.out.print("  Opcion: ");
                    op = sc.nextInt(); 
                }catch(Exception e){
                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                        sc.nextLine();
                    }
            }while((op < 1) || (op > 5));
            switch (op){
                case 1:                                
                    do{  
                        try{
                            System.out.print(morado+" ¿EN QUE SEMESTRE DE SOFTWARE SE ENCUENTRA LA MATERIA?: "+negro);
                            semestre = sc.nextInt();            
                        }catch(Exception e){
                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                        sc.nextLine();
                        }
                    }while((semestre<1)&&(semestre>10));
                    ElegirMatPro(SOF, P, semestre);
                    break;
                case 2:
                     do{                       
                    try{
                            System.out.print(morado+" ¿EN QUE SEMESTRE DE SISTEMAS COMPUTACIONALES SE ENCUENTRA LA MATERIA?: "+negro);
                            semestre = sc.nextInt();            
                        }catch(Exception e){
                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                        sc.nextLine();
                        }        
                    }while((semestre<1)&&(semestre>8));
                    ElegirMatPro(SIS, P, semestre);
                    break;
                case 3:
                    do{                       
                    try{
                            System.out.print(morado+" ¿EN QUE SEMESTRE DE TECNOLOGIAS DE LA INFORMACION SE ENCUENTRA LA MATERIA?: "+negro);
                            semestre = sc.nextInt();            
                        }catch(Exception e){
                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                        sc.nextLine();
                        }           
                    }while((semestre<1)&&(semestre>10));
                    ElegirMatPro(TIC, P, semestre);
                    break;
                case 4:
                    do{                       
                    try{
                            System.out.print(morado+" ¿EN QUE SEMESTRE DE NETWORKING SE ENCUENTRA LA MATERIA?: "+negro);
                            semestre = sc.nextInt();            
                        }catch(Exception e){
                        System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                        sc.nextLine();
                        }            
                    }while((semestre<1)&&(semestre>8));
                    ElegirMatPro(NET, P, semestre);
                    break;                                   
             
                case 5:
                    if(!P.getMaterias().isEmpty()){
                    aux=false;
                    listapersonas.add(P);                    
                    for(int i=0; i<listapersonas.size(); i++){
                        if(listapersonas.get(i).getCedula().contains(P.getCedula())){                
                            listapersonas.get(i).setFechaReg(listapersonas.get(i).RegistrarIngreso());
                            }
                        }
                    }
                    else{
                        System.out.println(rojo+" DEBE ELEGIR AL MENOS 1 MATERIA... "+negro);
                        Pulsar();
                    }
                    break;
            }
            
        }while(aux==true);
        
    }
    
    public static void regSecretaria(){
        Secretaria S = new Secretaria();
        int op = 0;
boolean auxcedula=false;
        S.setRol(3);
        System.out.println("\n\n\n\n\n");
        System.out.println(" ------------------------------------------------------------------------");
            System.out.println("|"+azul+"         ####   #####  #####  #####  ###  #####  ####   #####         "+negro+"|");
            System.out.println("|"+azul+"         #   #  #      #        #   #       #    #   #  #   #         "+negro+"|");
            System.out.println("|"+azul+"         #   #  ###    #        #    #      #    #   #  #   #         "+negro+"|");
            System.out.println("|"+azul+"         ####   ###    # ###    #     #     #    ####   #   #         "+negro+"|");
            System.out.println("|"+azul+"         #  #   #      #   #    #      #    #    #  #   #   #         "+negro+"|");
            System.out.println("|"+azul+"         #   #  #####  #####  ##### ###     #    #   #  #####         "+negro+"|");   
            System.out.println("|                                                                        |");
            System.out.println("|"+azul+"  ###  #####  #####  ####   #####  #####   ###   ####   #####   ###   "+negro+"|");
            System.out.println("|"+azul+" #     #      #      #   #  #        #    #   #  #   #    #    #   #  "+negro+"|");
            System.out.println("|"+azul+"  #    ###    #      #   #  ###      #    #   #  #   #    #    #   #  "+negro+"|");
            System.out.println("|"+azul+"   #   ###    #      ####   ###      #    #####  ####     #    #####  "+negro+"|");
            System.out.println("|"+azul+"    #  #      #      #  #   #        #    #   #  #  #     #    #   #  "+negro+"|");
            System.out.println("|"+azul+" ###   #####  #####  #   #  #####    #    #   #  #   #  #####  #   #  "+negro+"|");
        System.out.println(" -------------------------------------------------------------------------");
        System.out.print(verde+" Nombres: ");
        S.setNombre(sc.nextLine());
        System.out.print(verde+" Apellidos: ");
        S.setApellido(sc.nextLine());
        do{
            auxcedula = false;
            System.out.print(verde+" Cedula: ");
            S.setCedula(sc.nextLine());
            if (!listapersonas.isEmpty()){
                for( int k = 0;k < listapersonas.size();k++){                            
                    if (S.getCedula().equals(listapersonas.get(k).getCedula())){
                        auxcedula = true;
                        System.out.println(rojo+" **** CEDULA YA REGISTRADA **** "+negro);
                    }
                }
            }
        }while(auxcedula == true);
        do{
            try{
                System.out.print(verde+" Edad: ");
                S.setEdad(sc.nextInt()); 
                }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                sc.nextLine();
            }
        }while((S.getEdad()<22)||(S.getEdad()>65));
            
        S.setFechaNac(FechaNac());
        sc.nextLine();
        System.out.print(verde+" Telefono: ");        
        S.setTelefono(sc.nextLine());
        System.out.print(verde+" Direccion: ");        
        S.setDireccion(sc.nextLine());
        System.out.print(verde+" Correo Electronico: ");
        S.setCorreo(sc.nextLine());
        System.out.print(verde+" Contraseña: ");   
        S.setContraseña(sc.nextLine());
        do{
            try{
            System.out.print(verde+" Años de servicio: ");
            S.setAñoServ(sc.nextInt());
            }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO..."+negro);   
                sc.nextLine();
            }   
        }while((S.getAñoServ() < 1) || (S.getAñoServ() > 40));
        do{
            try{
                System.out.println(verde+" Turno de trabajo");
                System.out.println(verde+" 1"+negro+". Matutino");
                System.out.println(verde+" 2"+negro+". Vespertino");
                System.out.print("  Opcion: ");
                op = sc.nextInt(); 
            }catch(Exception e){
                pulsarenteros();
            }   
        }while((op < 1) || (op > 2));
        if (op==1)
            S.setTurno("Matutino");
        else 
            S.setTurno("Vespertino");
        
        listapersonas.add(S);
        for(int i=0; i<listapersonas.size(); i++){
            if(listapersonas.get(i).getCedula().contains(S.getCedula())){                
                listapersonas.get(i).setFechaReg(listapersonas.get(i).RegistrarIngreso());
            }
        }
    }
    
    public static void regConserje(){
        Conserje C = new Conserje();
        int op = 0;
        boolean auxcedula=false;
        C.setRol(4);
        System.out.println("\n\n\n\n\n");
        System.out.println(" ----------------------------------------------------------");
            System.out.println("|"+azul+" ####   #####  #####  #####  ###  #####  ####   #####   "+negro+"|");
            System.out.println("|"+azul+" #   #  #      #        #   #       #    #   #  #   #   "+negro+"|");
            System.out.println("|"+azul+" #   #  ###    #        #    #      #    #   #  #   #   "+negro+"|");
            System.out.println("|"+azul+" ####   ###    # ###    #     #     #    ####   #   #   "+negro+"|");
            System.out.println("|"+azul+" #  #   #      #   #    #      #    #    #  #   #   #   "+negro+"|");
            System.out.println("|"+azul+" #   #  #####  #####  ##### ###     #    #   #  #####   "+negro+"|");   
            System.out.println("|                                                        |");
            System.out.println("|"+azul+" #####  #####  #    #   ###  #####  ####   #####  ##### "+negro+"|");
            System.out.println("|"+azul+" #      #   #  ##   #  #     #      #   #    #    #     "+negro+"|");
            System.out.println("|"+azul+" #      #   #  # #  #   #    ###    #   #    #    ###   "+negro+"|");
            System.out.println("|"+azul+" #      #   #  #  # #    #   ###    ####     #    ###   "+negro+"|");
            System.out.println("|"+azul+" #      #   #  #   ##     #  #      #  #   # #    #     "+negro+"|");
            System.out.println("|"+azul+" #####  #####  #    #  ###   #####  #   #   ##    ##### "+negro+"|");                                    
        System.out.println(" ----------------------------------------------------------");
        System.out.print(verde+" Nombres: ");
        C.setNombre(sc.nextLine());
        System.out.print(verde+" Apellidos: ");
        C.setApellido(sc.nextLine());
        do{
            auxcedula = false;
            System.out.print(verde+" Cedula: ");
            C.setCedula(sc.nextLine());
            if (!listapersonas.isEmpty()){
                for( int k = 0;k < listapersonas.size();k++){                            
                    if (C.getCedula().equals(listapersonas.get(k).getCedula())){
                        auxcedula = true;
                        System.out.println(" **** CEDULA YA REGISTRADA **** ");
                    }
                }
            }
        }while(auxcedula == true);
        do{
            try{
                System.out.print(verde+" Edad: ");
                C.setEdad(sc.nextInt()); 
                }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                sc.nextLine();
            }
        }while((C.getEdad()<22)||(C.getEdad()>65));
            
        C.setFechaNac(FechaNac());
        sc.nextLine();
        System.out.print(verde+" Telefono: ");        
        C.setTelefono(sc.nextLine());
        System.out.print(verde+" Direccion: ");        
        C.setDireccion(sc.nextLine());
        System.out.print(verde+" Correo Electronico: ");
        C.setCorreo(sc.nextLine());
        System.out.print(verde+" Contraseña: ");   
        C.setContraseña(sc.nextLine());
        do{
            try{
            System.out.print(verde+" Años de servicio: ");
            C.setAñoServ(sc.nextInt());
            }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO..."+negro);   
                sc.nextLine();
            }   
        }while((C.getAñoServ() < 1) || (C.getAñoServ() > 40));
        do{
            try{
                System.out.print(negro+" Turno de trabajo ");
                System.out.println(verde+" 1"+negro+". Matutino");
                System.out.println(verde+" 2"+negro+". Vespertino");
                System.out.println(verde+" 3"+negro+". Nocturno");
                System.out.print("  Opcion: ");
                op = sc.nextInt(); 
                }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO..."+negro);   
                sc.nextLine();
            } 
        }while((op < 1) || (op > 3));
        if (op==1){
            C.setTurno("Matutino");
        } else {
            if (op==2)
                C.setTurno("Vespertino");
            else
                C.setTurno("Nocturno");
        }
        listapersonas.add(C);      
        for(int i=0; i<listapersonas.size(); i++){
            if(listapersonas.get(i).getCedula().contains(C.getCedula())){                
                listapersonas.get(i).setFechaReg(listapersonas.get(i).RegistrarIngreso());
            }
        }
    }
    // COMPLEMENTARIAS    
    public static void MostrarMatEst(Estudiante A){
        System.out.println(" ");
        System.out.println(azul+" SUS MATERIAS SON: "+negro);
        for(int i = 0; i < A.getMaterias().size(); i++){
            System.out.println("  "+A.getMaterias().get(i).getCodigoMat()+azul+" : "+negro+A.getMaterias().get(i).getNombreMat());
        }
        
        System.out.println(" ");
        sc.nextLine();
            
    }
        
    public static void ElegirMatPro(ArrayList<Materia> c, Profesor p, int semestre){                                            
        int f, n=1, op=0, u;
        boolean matRP=false, matR=false;
        ArrayList<Materia> MateriasTemp = new ArrayList();
        // MUESTRA LAS MATERIAS DE ESE SEMESTRE
        for(f=0;f<c.size();f++){
            if(semestre==c.get(f).getSemestreMat()){
                System.out.println(" "+n+azul+": "+negro+c.get(f).getNombreMat());
                n++;
                if(!MateriasTemp.contains(c.get(f))){
                    MateriasTemp.add(c.get(f));
                }
            }
        }
        System.out.println(" "+(n)+azul+": "+negro+"Escoger otra carrera/semestre"); 
        do{
            matRP=false; matR=false;
            do{
                try{
                System.out.print(" Opcion: ");
                op = sc.nextInt();
            }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO ENTRE 1 Y 3...");                
            }
            }while((op<1)||(op>n));
            
            if(op==(n)){
                break;
            }
            // VERIFICA QUE OTRO PROF NO TENGA ESA MATERIA
            for(u=0;u<listapersonas.size();u++){
                if(listapersonas.get(u).getRol()==2){
                    Persona pro = listapersonas.get(u);
                    Profesor Pf = (Profesor) pro;
                    if(Pf.getMaterias().contains(MateriasTemp.get(op-1))){
                        matRP = true;
                    }
                }
            }
            
            if (!p.getMaterias().contains(MateriasTemp.get(op-1)) && matRP==false){
                    p.getMaterias().add(MateriasTemp.get(op-1));
                    System.out.println(verde+" Se ha registrado exitosamente... ");
            }else if(p.getMaterias().contains(MateriasTemp.get(op-1)) && matRP==false){
                    matR=true;
                } 
        }while((matRP || matR));
    }
//GUARDAN LAS FECHAS DE NACIMIENTO DE MANERA GENERAL
    public static Fecha FechaNac(){
        Fecha F = new Fecha();
        System.out.println(verde+" Fecha de nacimiento");        
        do{
            try{
                System.out.print(verde+" Año: ");          
                F.setYear(sc.nextInt());
            }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                sc.nextLine();
            }
          }while((F.getYear()<1950)||(F.getYear()>2004));        
        do{
            try{
                System.out.print(verde+" Mes: ");
                F.setMes(sc.nextInt());
            }catch(Exception e){
            System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
            sc.nextLine();
        }
         }while((F.getMes()<1)||(F.getMes()>12));
        do{   
            try{
                System.out.print(verde+" Día: ");
                F.setDia(sc.nextInt());
            }catch(Exception e){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                sc.nextLine();
            }
        }while((F.getDia()<1)||(F.getDia()>31));
        
        return F;
    }
    
    public static void MostrarAlumnos(int aux2, int k, Profesor P){
        int c=0;
        String palabra="REPROBADO";
        for(int j = 0; j < listapersonas.size(); j++){
            if ((listapersonas.get(j).getRol()==1)){
                Persona est = listapersonas.get(j);
                Estudiante E = (Estudiante) est;
                for(int h=0;h<E.getMaterias().size();h++){
                    if(E.getMaterias().get(h).getCalificaciones()==null){
                        aux2=0;
                    }else if (E.getMaterias().get(h).getNombreMat().equals(P.getMaterias().get(k).getNombreMat())){
                        if(E.getMaterias().get(h).getCalificaciones()[3]>=7){
                            palabra="APROBADO";
                         }
                        else if((E.getMaterias().get(h).getCalificaciones()[3]<7)&&(E.getMaterias().get(h).getCalificaciones()[3]>0)){
                        palabra="REPROBADO";
                        }
                        else if(E.getMaterias().get(h).getCalificaciones()[3]==0){
                            palabra="SIN NOTA";
                        }
                        System.out.println(" "+(c+1)+". "+E.getApellido()+" "+E.getNombre()+" - "+palabra);
                        System.out.println(" 1 Parcial = "+E.getMaterias().get(h).getCalificaciones()[0]+" | 2 Parcial = "+E.getMaterias().get(h).getCalificaciones()[1]+" | PROMEDIO = "+E.getMaterias().get(h).getCalificaciones()[3]);
                        c++;
                    }
                }
            }
        }
    }
    //SIMULADORES DE GETCH
    public static void pulsarenteros(){
                System.out.println(rojo+"  DEBE INGRESAR UN NUMERO...");   
                sc.nextLine();
                Pulsar();
    }
    
    
    public static void Pulsar(){
        String intro;
        try{            
            System.out.println(rojo+" Pulse una tecla para continuar..."+negro);
            intro = sc.nextLine();
        }catch(Exception e){}
    }

    // BASE DE DATOS DE MATERIAS
    
    public static void SOFWARE(){
        
        SOF.add(new Materia("CÁLCULO DIFERENCIAL",111,1,"SOF"));                        
        SOF.add(new Materia("INTRODUCCIÓN A INGENIERÍA DE SOFTWARE",112,1,"SOF"));
        SOF.add(new Materia("DEMOCRACIA, CIUDADANÍA Y GLOBALIZACIÓN",113,1,"SOF"));
        SOF.add(new Materia("LENGUAJE Y COMUNICACIÓN",114,1,"SOF"));
        SOF.add(new Materia("ESTRUCTURAS DISCRETAS",115,1,"SOF"));
        SOF.add(new Materia("ALGORITMOS Y LÓGICA DE PROGRAMACIÓN",116,1,"SOF"));

        SOF.add(new Materia("CÁLCULO INTEGRAL",211,2,"SOF"));
        SOF.add(new Materia("PROGRAMACIÓN ORIENTADA A OBJETOS",212,2,"SOF"));
        SOF.add(new Materia("METODOLOGÍA DE LA INVESTIGACIÓN I",213,2,"SOF"));
        SOF.add(new Materia("CONTABILIDAD",214,2,"SOF"));
        SOF.add(new Materia("ALGEBRA LINEAL",215,2,"SOF"));
        SOF.add(new Materia("ORGANIZACIÓN Y ARQUITECTURA COMPUTACIONAL",216,2,"SOF"));

        SOF.add(new Materia("PROCESO DE SOFTWARE",311,3,"SOF"));
        SOF.add(new Materia("ESTADÍSTICA I",312,3,"SOF"));
        SOF.add(new Materia("ESTRUCTURA DE DATOS",313,3,"SOF"));
        SOF.add(new Materia("INGENIERÍA DE REQUERIMIENTOS",314,3,"SOF"));
        SOF.add(new Materia("SISTEMAS OPERATIVOS",315,3,"SOF"));

        SOF.add(new Materia("INVESTIGACIÓN DE OPERACIONES",411,4,"SOF"));
        SOF.add(new Materia("MODELAMIENTO DE SOFTWARE",412,4,"SOF"));
        SOF.add(new Materia("ESTADÍSTICA II",413,4,"SOF"));
        SOF.add(new Materia("REDES DE COMPUTADORAS",414,4,"SOF"));
        SOF.add(new Materia("BASE DE DATOS",415,4,"SOF"));

        SOF.add(new Materia("DISEÑO Y ARQUITECTURA DE SOFTWARE",511,5,"SOF"));
        SOF.add(new Materia("METODOLOGÍA DE LA INVESTIGACIÓN II",512,5,"SOF"));
        SOF.add(new Materia("FINANZAS",513,5,"SOF"));
        SOF.add(new Materia("INTERACCIÓN HOMBRE -MÁQUINA",514,5,"SOF"));
        SOF.add(new Materia("PROGRAMACIÓN ORIENTADA A EVENTOS",515,5,"SOF"));

        SOF.add(new Materia("CONSTRUCCIÓN DE SOFTWARE",611,6,"SOF"));
        SOF.add(new Materia("COMPORTAMIENTO ORGANIZACIONAL",612,6,"SOF"));
        SOF.add(new Materia("DESARROLLO DE APLICACIONES WEB",613,6,"SOF"));
        SOF.add(new Materia("DISEÑO DE EXPERIENCIA DE USUARIO",614,6,"SOF"));
        SOF.add(new Materia("BASE DE DATOS AVANZADO",615,6,"SOF"));

        SOF.add(new Materia("CALIDAD DEL SOFTWARE",711,7,"SOF"));
        SOF.add(new Materia("SERVICIO COMUNITARIO",712,7,"SOF"));
        SOF.add(new Materia("MARCO LEGAL DE LA PROFESIÓN",713,7,"SOF"));
        SOF.add(new Materia("DESARROLLO DE APLICACIONES WEB AVANZADO",714,7,"SOF"));
        SOF.add(new Materia("INTELIGENCIA DE NEGOCIOS",715,7,"SOF"));

        SOF.add(new Materia("VERIFICACIÓN Y VALIDACIÓN DE SOFTWARE",811,8,"SOF"));
        SOF.add(new Materia("PRÁCTICAS PREPROFESIONALES I",812,8,"SOF"));
        SOF.add(new Materia("DESARROLLO DE APLICACIONES MÓVILES",813,8,"SOF"));
        SOF.add(new Materia("SEGURIDAD INFORMÁTICA",814,8,"SOF"));
        SOF.add(new Materia("EMPRENDIMIENTO E INNOVACIÓN",815,8,"SOF"));

        SOF.add(new Materia("GESTIÓN DE LA CONFIGURACIÓN DEL SOFTWARE",911,9,"SOF"));
        SOF.add(new Materia("PRÁCTICAS PREPROFESIONALES II",912,9,"SOF"));
        SOF.add(new Materia("ELABORACIÓN DE PROYECTOS",913,9,"SOF"));
        SOF.add(new Materia("APLICACIONES DISTRIBUIDAS",914,9,"SOF"));
        SOF.add(new Materia("INTELIGENCIA ARTIFICIAL",915,9,"SOF"));

        SOF.add(new Materia("AUDITORÍA DE SOFTWARE",991,10,"SOF"));
        SOF.add(new Materia("UNIDAD DE INTEGRACIÓN CURRICULAR",992,10,"SOF"));
        SOF.add(new Materia("GESTIÓN DE PROYECTOS DE SOFTWARE",993,10,"SOF"));
        SOF.add(new Materia("SISTEMAS DE INFORMACIÓN GERENCIAL",994,10,"SOF"));

}
    
    public static void TICS(){
    
        TIC.add(new Materia("FISICA BASICA",11,1,"TIC"));
        TIC.add(new Materia("ALGEBRA LINEAL",12,1,"TIC"));
        TIC.add(new Materia("FUNDAMENTOS DE TI",13,1,"TIC"));
        TIC.add(new Materia("CALCULO DIFERENCIAL",14,1,"TIC"));
        TIC.add(new Materia("QUIMICA INORGANICA",15,1,"TIC"));
        TIC.add(new Materia("LENGUAJE Y COMUNICACION",16,1,"TIC"));

        TIC.add(new Materia("CIRCUITOS ELECTRICOS",21,2,"TIC"));
        TIC.add(new Materia("COMUNICACION DE DATOS",22,2,"TIC"));
        TIC.add(new Materia("PROGRAMACION",23,2,"TIC"));
        TIC.add(new Materia("CALCULO INTEGRAL",24,2,"TIC"));
        TIC.add(new Materia("METODOLOGIA DE LA INVESTIGACION",25,2,"TIC"));
        TIC.add(new Materia("COMUNICACION ORGANIZACIONAL",26,2,"TIC"));

        TIC.add(new Materia("CIRCUITOS ELECTRONICOS",31,3,"TIC"));
        TIC.add(new Materia("CONMUTACION",32,3,"TIC"));
        TIC.add(new Materia("SISTEMAS DE CABLEADO ESTRUCTURADO",33,3,"TIC"));
        TIC.add(new Materia("ESTRUCTURA DE DATOS",34,3,"TIC"));
        TIC.add(new Materia("ECUACIONES DIFERENCIALES",35,3,"TIC"));
        TIC.add(new Materia("ESTADISTICA DESCRIPTIVA",36,3,"TIC"));

        TIC.add(new Materia("SISTEMAS DIGITALES",41,4,"TIC"));
        TIC.add(new Materia("ENRUTAMIENTO",42,4,"TIC"));
        TIC.add(new Materia("PROGRAMACION ORIENTADA A OBJETOS",43,4,"TIC"));
        TIC.add(new Materia("BASE DE DATOS",44,4,"TIC"));
        TIC.add(new Materia("ECOLOGIA Y MEDIO AMBIENTE",45,4,"TIC"));
        TIC.add(new Materia("ESTADISTICA INFERENCIAL",46,4,"TIC"));

        TIC.add(new Materia("ARQUITECTURA Y ORGANIZACION COMPUTACIONAL",51,5,"TIC"));
        TIC.add(new Materia("REDES AVANZADAS",52,5,"TIC"));
        TIC.add(new Materia("TECNOLOGIAS WEB",53,5,"TIC"));
        TIC.add(new Materia("ADMINISTRACION DE BASE DE DATOS",54,5,"TIC"));
        TIC.add(new Materia("RESPONSABILIDAD SOCIAL Y ETICA PROFESIONAL",55,5,"TIC"));
        TIC.add(new Materia("INGENIERIA ECONOMICA I",56,5,"TIC"));

        TIC.add(new Materia("SEGURIDAD DE LA INFORMACION",61,6,"TIC"));
        TIC.add(new Materia("DISEÑO DE REDES",62,6,"TIC"));
        TIC.add(new Materia("INGENIERIA DE SOFTWARE",63,6,"TIC"));
        TIC.add(new Materia("ALMACENES DE DATOS",64,6,"TIC"));
        TIC.add(new Materia("PROGRAMACION WEB",65,6,"TIC"));
        TIC.add(new Materia("INGENIERIA ECONOMICA II",66,6,"TIC"));

        TIC.add(new Materia("SISTEMAS OPERATIVOS",71,7,"TIC"));
        TIC.add(new Materia("SEGURIDAD EN INFRAESTRUCTURA TI",72,7,"TIC"));
        TIC.add(new Materia("GESTION DE REDES",73,7,"TIC"));
        TIC.add(new Materia("INTERACCION HOMBRE MAQUINA",74,7,"TIC"));
        TIC.add(new Materia("GESTION DE CALIDAD EN TIC",75,7,"TIC"));
        TIC.add(new Materia("MARKETING",76,7,"TIC"));

        TIC.add(new Materia("ARQUITECTURA DE SERVICIOS DISTRIBUIDOS",81,8,"TIC"));
        TIC.add(new Materia("PRESUPUESTOS Y FINANZAS DE PROYECTOS TI",82,8,"TIC"));
        TIC.add(new Materia("SEGURIDAD EN BASES DE DATOS",83,8,"TIC"));
        TIC.add(new Materia("INTEGRACION DE PLATAFORMAS",84,8,"TIC"));
        TIC.add(new Materia("EMPRENDIMIENTO",85,8,"TIC"));
        TIC.add(new Materia("DISEÑO DE APLICACIONES E INFRAESTRUCTURAS SEGURAS",86,8,"TIC"));
        TIC.add(new Materia("GESTION DE REDES AVANZADA",87,8,"TIC"));
        TIC.add(new Materia("INFRAESTRUCTURA DE REDES DE CENTROS DE DATOS",88,8,"TIC"));

        TIC.add(new Materia("INFORMATICA FORENSE",91,9,"TIC"));
        TIC.add(new Materia("UNIDAD DE TITULACION 1",92,9,"TIC"));
        TIC.add(new Materia("GESTION DE PROYECTOS",93,9,"TIC"));
        TIC.add(new Materia("IMPLEMENTACION DE APLICACIONES E INFRAESTRUCTURAS SEGURAS",94,9,"TIC"));
        TIC.add(new Materia("GESTION DE REDES DE CENTROS DE DATOS",95,9,"TIC"));
        TIC.add(new Materia("INFRAESTRUCTURAS VIRTUALIZADAS",96,9,"TIC"));

        TIC.add(new Materia("AUDITORIA DE TI",101,10,"TIC"));
        TIC.add(new Materia("MARCO LEGAL DE LA PROFESION",102,10,"TIC"));
        TIC.add(new Materia("UNIDAD DE TITULACION 2",103,10,"TIC"));
        TIC.add(new Materia("ETHICAL HACKING",104,10,"TIC"));
        TIC.add(new Materia("GESTION DE REDES MOVILES",105,10,"TIC"));
        TIC.add(new Materia("REDES CONVERGENTES",106,10,"TIC"));
        
    }
    
    public static void NETWORKING(){
        NET.add(new Materia("MATEMATICA I",12,1,"NET"));
        NET.add(new Materia("MATEMATICAS DISCRETAS",13,1,"NET"));
        NET.add(new Materia("PROGRAMACION I",14,1,"NET"));
        NET.add(new Materia("INTRODUCCION COMPUTACIONAL",15,1,"NET"));
        NET.add(new Materia("CIRCUITOS ELECTRICOS",16,1,"NET"));
        NET.add(new Materia("IDIOMA ESPAÑOL",17,1,"NET"));

        NET.add(new Materia("MATEMATICA II",18,2,"NET"));
        NET.add(new Materia("ALGEBRA LINEAL",19,2,"NET"));
        NET.add(new Materia("PROGRAMACIÓN II",20,2,"NET"));
        NET.add(new Materia("CIRCUITOS ELECTRONICOS",21,2,"NET"));
        NET.add(new Materia("CONTABILIDAD GENERAL",22,2,"NET"));
        NET.add(new Materia("COMUNICACIÓN ORAL Y ESCRITA",23,2,"NET"));

        NET.add(new Materia("MATEMATICA III",24,3,"NET"));
        NET.add(new Materia("PROBABILIDAD Y ESTADISTICA",25,3,"NET"));
        NET.add(new Materia("PROGRAMACIÓN III",26,3,"NET"));
        NET.add(new Materia("ESTRUCTURA DE DATOS",27,3,"NET"));
        NET.add(new Materia("FISICA",28,3,"NET"));
        NET.add(new Materia("CONTABILIDAD DE COSTOS",29,3,"NET"));
        NET.add(new Materia("METODOLOGIA DE LA INVESTIGACIÓN",30,3,"NET"));

        NET.add(new Materia("MATEMATICAS AVANZADAS",31,4,"NET"));
        NET.add(new Materia("INSTALACIONES INFORMATICAS",32,4,"NET"));
        NET.add(new Materia("REDES I",33,4,"NET"));
        NET.add(new Materia("BASE DE DATOS",34,4,"NET"));
        NET.add(new Materia("SISTEMAS OPERATIVOS",35,4,"NET"));
        NET.add(new Materia("SISTEMAS DIGITALES",36,4,"NET"));
        NET.add(new Materia("MANTENIMIENTO DE EQUIPOS ELECTRONICOS",37,4,"NET"));

        NET.add(new Materia("PROCESOS ESTOCASTICOS",38,5,"NET"));
        NET.add(new Materia("TECNOLOGIA DE INTERNET",39,5,"NET"));
        NET.add(new Materia("REDES II",40,5,"NET"));
        NET.add(new Materia("PROGRAMACIÓN AVANZADA CON JAVA",41,5,"NET"));
        NET.add(new Materia("SISTEMAS OPERATIVOS DISTRIBUIDOS",42,5,"NET"));
        NET.add(new Materia("ORGANIZACION Y ARQUITECTURA COMPUTACIONAL",43,5,"NET"));
        NET.add(new Materia("LABORATORIO DE ELECTRONICA DIGITAL",44,5,"NET"));

        NET.add(new Materia("TELECOMUNICACIONES I",45,6,"NET"));
        NET.add(new Materia("PRINCIPIOS DE CONVERGENCIA DIGITAL",46,6,"NET"));
        NET.add(new Materia("REDES III",47,6,"NET"));
        NET.add(new Materia("DISEÑO DE REDES I",48,6,"NET"));
        NET.add(new Materia("PROGRAMACION PARA REDES",49,6,"NET"));
        NET.add(new Materia("LABORATORIO DE SISTEMAS OPERATIVOS",50,6,"NET"));
        NET.add(new Materia("PRESUPUESTO Y FINANZAS",51,6,"NET"));

        NET.add(new Materia("TELECOMUNICACIONES II",52,7,"NET"));
        NET.add(new Materia("COMUNICACIONES DIGITALES",53,7,"NET"));
        NET.add(new Materia("REDES IV",54,7,"NET"));
        NET.add(new Materia("DISEÑO DE REDES II",55,7,"NET"));
        NET.add(new Materia("DISEÑO E IMPLEMENTACION DE SEGURIDADES",56,7,"NET"));
        NET.add(new Materia("ADMINISTRACION DE RECURSOS Y TALENTO HUMANO",57,7,"NET"));
        NET.add(new Materia("INGENIERIA ECONOMICA",58,7,"NET"));

        NET.add(new Materia("TELECOMUNICACIONES III",59,8,"NET"));
        NET.add(new Materia("SISTEMAS TELEFONICOS",60,8,"NET"));
        NET.add(new Materia("TECNOLOGIAS WIRELESS AVANZADAS",61,8,"NET"));
        NET.add(new Materia("AUDITORIA DE SEGURIDADES PARA REDES",62,8,"NET"));
        NET.add(new Materia("MARCO REGULATORIO DE LAS TELECOMUNICACIONES",63,8,"NET"));
        NET.add(new Materia("PROYECTOS",64,8,"NET"));
        NET.add(new Materia("MARKETING Y EMPRENDIMIENTO",65,8,"NET"));
        NET.add(new Materia("ELECTIVA PROFESIONAL",66,8,"NET"));
        
       
    }
    
    public static void SISTEMAS(){
    
        SIS.add(new Materia("MATEMATICA I",101,1,"SIS"));
        SIS.add(new Materia("MATEMATICAS DISCRETAS",102,1,"SIS"));
        SIS.add(new Materia("PROGRAMACION I",103,1,"SIS"));
        SIS.add(new Materia("INTRODUCCION COMPUTACIONAL",104,1,"SIS"));
        SIS.add(new Materia("CIRCUITOS ELECTRICOS",106,1,"SIS"));
        SIS.add(new Materia("IDIOMA ESPAÑOL",108,1,"SIS"));

        SIS.add(new Materia("MATEMATICA II",201,2,"SIS"));
        SIS.add(new Materia("ALGEBRA LINEAL",202,2,"SIS"));
        SIS.add(new Materia("PROGRAMACIÓN II",203,2,"SIS"));
        SIS.add(new Materia("CIRCUITOS ELECTRONICOS",206,2,"SIS"));
        SIS.add(new Materia("CONTABILIDAD GENERAL",207,2,"SIS"));
        SIS.add(new Materia("COMUNICACIÓN ORAL Y ESCRITA",208,2,"SIS"));
        SIS.add(new Materia("ELECTIVA I",209,3,"SIS"));

        SIS.add(new Materia("MATEMATICA III",301,3,"SIS"));
        SIS.add(new Materia("PROBABILIDAD Y ESTADISTICAS",302,3,"SIS"));
        SIS.add(new Materia("PROGRAMACIÓN III",303,3,"SIS"));
        SIS.add(new Materia("ESTRUCTURA DE DATOS",305,3,"SIS"));
        SIS.add(new Materia("FISICA APLICADA",306,3,"SIS"));
        SIS.add(new Materia("CONTABILIDAD DE COSTOS",307,3,"SIS"));
        SIS.add(new Materia("METODOLOGIA DE LA INVESTIGACIÓN",308,3,"SIS"));

        SIS.add(new Materia("METODOS NUMERICOS",401,4,"SIS"));
        SIS.add(new Materia("PROGRAMACION ORIENTADA A OBJETOS",403,4,"SIS"));
        SIS.add(new Materia("TEORIA GENERAL DE LOS SISTEMAS",404,4,"SIS"));
        SIS.add(new Materia("BASE DE DATOS",405,4,"SIS"));
        SIS.add(new Materia("INGENIERIA DE SOFTWARE",406,4,"SIS"));
        SIS.add(new Materia("CIRCUITOS DIGITALES",407,4,"SIS"));
        SIS.add(new Materia("ANALISIS FINANCIEROS",408,4,"SIS"));
        SIS.add(new Materia("ELECTIVA II",409,4,"SIS"));

        SIS.add(new Materia("INVESTIGACION DE OPERACIONES",501,5,"SIS"));
        SIS.add(new Materia("INTELIGENCIA ARTIFICIAL",503,5,"SIS"));
        SIS.add(new Materia("ORGANIZACION Y ARQUITECTURA COMPUTACIONAL",504,5,"SIS"));
        SIS.add(new Materia("BASES DE DATOS II",505,5,"SIS"));
        SIS.add(new Materia("INGENIERIA DE SOFTWARE ORIENTADA A OBJETOS",506,5,"SIS"));
        SIS.add(new Materia("LABORATORIO DE ELECTRONICA DIGITAL",507,5,"SIS"));
        SIS.add(new Materia("COMPORTAMIENTO ORGANIZACIONAL Y TALENTO HUMANO",509,5,"SIS"));

        SIS.add(new Materia("SIMULACION DE SISTEMAS",601,6,"SIS"));
        SIS.add(new Materia("PROGRAMACION DE MICROPROCESADORES",603,6,"SIS"));
        SIS.add(new Materia("SISTEMAS OPERATIVOS",604,6,"SIS"));
        SIS.add(new Materia("DESARROLLO DE APLICACIONES WEB",605,6,"SIS"));
        SIS.add(new Materia("REDES DE COMPUTADORAS",606,6,"SIS"));
        SIS.add(new Materia("MATEMATICAS FINANCIERAS",608,6,"SIS"));
        SIS.add(new Materia("LEGISLACION INFORMATICA",609,6,"SIS"));
        SIS.add(new Materia("ELECTIVA III",610,6,"SIS"));

        SIS.add(new Materia("COMPILADORES",703,7,"SIS"));
        SIS.add(new Materia("SISTEMAS OPERATIVOS DISTRIBUIDOS",704,7,"SIS"));
        SIS.add(new Materia("ADMINISTRACION DE CENTROS DE COMPUTO",705,7,"SIS"));
        SIS.add(new Materia("SEGURIDAD INFORMATICA",706,7,"SIS"));
        SIS.add(new Materia("ECONOMIA",708,7,"SIS"));

        SIS.add(new Materia("SISTEMAS DE INFORMACION GERENCIAL",804,8,"SIS"));
        SIS.add(new Materia("GESTION DE PROYECTOS",805,8,"SIS"));
        SIS.add(new Materia("AUDITORIA DE SISTEMAS",806,8,"SIS"));
        SIS.add(new Materia("FINANZAS",807,8,"SIS"));
        SIS.add(new Materia("MARKETING Y EMPRENDIMIENTO",808,8,"SIS"));
        SIS.add(new Materia("ELECTIVA IV",810,8,"SIS"));
        
    }            
}
