/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class CollegeList {
    public static void main(String[] args) {
        ArrayList<CollegeEmployee> empleados = new ArrayList<CollegeEmployee>();
        ArrayList<Student> estudiantes = new ArrayList<Student>();
        ArrayList<Faculty> facul = new ArrayList<Faculty>();
        
        int em=0, es=0, fa=0;
        
        Scanner leer = new Scanner(System.in);
        char resp;
        
        do {
            System.out.println("Qué tipo de empleado desea ingresar los datos? (C, F, S, Q [para salir])");
            resp = leer.nextLine().charAt(0);
            if ((em==4)||(es==7)||(fa==3)) {
                continue;
            }
            switch (resp) {
                case 'C':
                    em++;
                    CollegeEmployee empleado = new CollegeEmployee();
                    System.out.println("Introduzca el primer nombre del empleado:");
                    String nombre = leer.nextLine();
                    empleado.setFirstName(nombre);
                    System.out.println("Introduzca el apellido del empleado");
                    String apellido = leer.nextLine();
                    empleado.setLastName(apellido);
                    System.out.println("Introduzca la dirección del empleado");
                    String dirección = leer.nextLine();
                    empleado.setStreetAddres(dirección);
                    System.out.println("Introduzca el código postal del empleado:");
                    Integer zip = leer.nextInt();
                    leer.nextLine();
                    empleado.setZipCode(zip);
                    System.out.println("Introduzca el número teléfonico del empleado");
                    String num = leer.nextLine();
                    empleado.setPhoneNumber(num);
                    System.out.println("Introduzca el número de seguridad social");
                    Integer segu = leer.nextInt();
                    empleado.setSocialSecur(segu);
                    System.out.println("Introduzca el salario anual");
                    double salario = leer.nextDouble();
                    leer.nextLine();
                    empleado.setAnualSalary(salario);
                    System.out.println("Introduzca el departamento del empleado");
                    String dep = leer.nextLine();
                    empleado.setDepName(dep);
                    empleados.add(empleado);
                    break;
                case 'F':
                    fa++;
                    Faculty faculta = new Faculty();
                    System.out.println("Introduzca el primer nombre del docente:");
                    nombre = leer.nextLine();
                    faculta.setFirstName(nombre);
                    System.out.println("Introduzca el apellido del docente");
                    apellido = leer.nextLine();
                    faculta.setLastName(apellido);
                    System.out.println("Introduzca la dirección del docente");
                    dirección = leer.nextLine();
                    faculta.setStreetAddres(dirección);
                    System.out.println("Introduzca el código postal del docente:");
                    zip = leer.nextInt();
                    leer.nextLine();
                    faculta.setZipCode(zip);
                    System.out.println("Introduzca el número teléfonico del docente");
                    num = leer.nextLine();                    
                    faculta.setPhoneNumber(num);
                    System.out.println("Introduzca el número de seguridad docente");
                    segu = leer.nextInt();
                    faculta.setSocialSecur(segu);
                    System.out.println("Introduzca el salario anual");
                    salario = leer.nextDouble();
                    leer.nextLine();
                    faculta.setAnualSalary(salario);
                    System.out.println("Introduzca el departamento del docente");
                    dep = leer.nextLine();
                    faculta.setDepName(dep);
                    System.out.println("El docente es permanentente (y/n)");
                    char perm = leer.nextLine().charAt(0);
                    faculta.setPermanente((perm=='y'));
                    facul.add(faculta);                    
                    break;
                case 'S':
                    es++;
                    Student estudiante = new Student();
                    System.out.println("Introduzca el primer nombre del estudiante:");
                    nombre = leer.nextLine();
                    estudiante.setFirstName(nombre);
                    System.out.println("Introduzca el apellido del estudiante");
                    apellido = leer.nextLine();
                    estudiante.setLastName(apellido);
                    System.out.println("Introduzca la dirección del estudiante");
                    dirección = leer.nextLine();
                    estudiante.setStreetAddres(dirección);
                    System.out.println("Introduzca el código postal del estudiante:");
                    zip = leer.nextInt();
                    leer.nextLine();
                    estudiante.setZipCode(zip);
                    System.out.println("Introduzca el número teléfonico del estudiante");
                    num = leer.nextLine();
                    estudiante.setPhoneNumber(num);
                    System.out.println("Introduzca la carrera del estudiante");
                    String carrera = leer.nextLine();
                    estudiante.setMajor(carrera);
                    System.out.println("Introduzca el promedio del estudiante");
                    double prom = leer.nextDouble();
                    leer.nextLine();
                    estudiante.setAverage(prom);
                    estudiantes.add(estudiante);
                    break;
                case 'Q':
                    break;
            }
            
        } while (resp!='Q');
        
        for (Faculty faculty : facul) {
            faculty.display();
        }
        
        for (Student estudiante : estudiantes) {
            estudiante.display();
        }
        
        for (CollegeEmployee empleado : empleados) {
            empleado.display();
        }
        
    }
    
}
