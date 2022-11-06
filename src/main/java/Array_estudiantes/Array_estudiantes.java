package Array_estudiantes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Array_estudiantes {

    public static void main(String[] args) {
        // Persona p = new Persona();
        int opcion = 0;

        ArrayList<Estudiantes> lista_Estudiantes = new ArrayList<Estudiantes>();
        ArrayList<Estudiantes> lista_ganada = new ArrayList<Estudiantes>();
        ArrayList<Estudiantes> lista_perdida = new ArrayList<Estudiantes>();

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1.Adicionar Estudiante \n" +
                            "2.Mostrar todos los estudiantes \n" +
                            "3.Mostrar el estudiante x \n" +
                            "4.Cambiar la nota estudiante x \n" +
                            "5.Eliminar estudiante x \n" +
                            "6.Eliminar toda la lista\n" +
                            "7.Mostrar lo estudiantes con 3 letras\n" +
                            "8.Generar lista1 y lista2 con notas ganadas y perdidas\n" +
                            "9.Mostrar Notas por una asignatura x\n" +
                            "10.promedio notas x\n" +
                            "11.porcentanjes ganaron y perdieron x\n" +
                            "12.Salir\n" +
                            "Ingresar La opcion [1 a 10]",
                    "Menú Arraylist", JOptionPane.QUESTION_MESSAGE));

            switch (opcion) {
                case 1:
                    int x; // Integer.parseInt(JOptionPane.showInputDialog(null, "digite pocision"));

                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite Codigo"));
                    String nom = JOptionPane.showInputDialog("Digite Estudiante");
                    String materia = JOptionPane.showInputDialog("Digite Materia");
                    float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite nota"));
                    Estudiantes regi = new Estudiantes(codigo, nom, materia, nota);
                    lista_Estudiantes.add(regi);

                    // System.out.println(dato);
                    // int dato = Integer.parseInt(
                    // JOptionPane.showInputDialog(null, "digite opcion 1 para adicionar"));

                    break;

                case 2:
                    if (lista_Estudiantes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Lista Vacia");
                    } else {
                        if (lista_Estudiantes.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        } else {
                            /*
                             * int pos = 0;
                             * String salida = "";
                             * for (String elemento : lista) {
                             * salida = salida + pos + " ";
                             * salida = salida + elemento;
                             * salida = salida + "\n";
                             * pos++;
                             * } // fin for
                             * JOptionPane.showMessageDialog(null, "Datos del Arraylist \n" + salida);
                             */

                            for (int i = 0; i < lista_Estudiantes.size(); i++) {
                                JOptionPane.showMessageDialog(null, " " + i + " " + lista_Estudiantes.get(i));
                            }
                        }

                    }
                    break;

                case 3:
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "digite pocision "));
                    if (x <= lista_Estudiantes.size()) {
                        JOptionPane.showMessageDialog(null,
                                "El dato de posicion " + x + " ES " + lista_Estudiantes.get(x));
                    } else {

                        JOptionPane.showMessageDialog(null, "x es mayor al Tamaño");
                    }

                case 4:
                    int codigox;
                    String nomx;
                    String materiax;
                    float notax;

                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "digite pocision "));
                    if (x <= lista_Estudiantes.size()) {

                        JOptionPane.showMessageDialog(null,
                                "El dato de posición " + x + " ES " + lista_Estudiantes.get(x));
                        // actualizar tiempo real
                        notax = lista_Estudiantes.get(x).getNota();
                        codigox = lista_Estudiantes.get(x).getCodigo();
                        nomx = lista_Estudiantes.get(x).getNombre();
                        materiax = lista_Estudiantes.get(x).getMateria();
                        // dato a actulizar
                        notax = Float.parseFloat(
                                JOptionPane.showInputDialog("digite nota" /* + lista_Estudiantes.get(x).getNota()) */));

                        Estudiantes regin = new Estudiantes(codigox, nomx, materiax, notax);
                        lista_Estudiantes.add(x, regin);
                    } else {
                        JOptionPane.showMessageDialog(null, "x es mayor al Tamaño");

                    }

                    break;

                case 5:
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "digite pocision "));
                    if (x <= lista_Estudiantes.size()) {
                        lista_Estudiantes.remove(x);
                        JOptionPane.showMessageDialog(null, "el estudiante fue removido");
                    } else {
                        JOptionPane.showMessageDialog(null, "el estudiante no  fue removido");

                    }
                    break;

                case 6:
                    if (!lista_Estudiantes.isEmpty()) {
                        lista_Estudiantes.clear();
                    } else {
                        JOptionPane.showMessageDialog(null, "lista esta vacia");

                    }

                    break;
                case 7:
                    for (Estudiantes estudiante : lista_Estudiantes) {
                        if (estudiante.getNombre().length() == 3) {
                            lista_Estudiantes.add(estudiante);
                        }
                    }

                    System.out.println("Lista 1 con 3 letras " + lista_Estudiantes);

                    break;

                case 8:

                    for (Estudiantes estudiante : lista_Estudiantes) {
                        if (estudiante.getNota() >= 3.0) {
                            lista_ganada.add(estudiante);
                        } else {
                            lista_perdida.add(estudiante);
                        }

                    }
                    System.out.println("ganadas" + lista_ganada);
                    System.out.println("perdidas" + lista_perdida);

                    break;
                case 9:
                    String x2 = JOptionPane.showInputDialog(null, "ingrese la notas asignaturas que quieres ver");
                    for (int i = 0; i < lista_Estudiantes.size(); i++) {
                        if (lista_Estudiantes.get(i).getMateria().equals(x2)) {
                            JOptionPane.showMessageDialog(null, "nota es " + lista_Estudiantes.get(i).getNota());
                        } else {
                            JOptionPane.showMessageDialog(null, "error nota");

                        }
                    }

                    break;

                case 10:
                    float suma = 0,n=0, prom = 0;

                    int count = 0;
                    String x3 = JOptionPane.showInputDialog(null, "ingrese la notas asignaturas que quieres ver");
                    for (int i = 0; i < lista_Estudiantes.size(); i++) {
                        n = lista_Estudiantes.get(i).getNota();
                        String materiax3 = lista_Estudiantes.get(i).getMateria();
                        if (materiax3.equals(x3)) {
                           suma+=n;
                           count += 1;

                        }else{
                            System.out.println("error");
                        }
                        //System.out.println(n);
                        //JOptionPane.showMessageDialog(null,"acumulador g"+ n);
                    }

                    prom = suma/count;
                    JOptionPane.showMessageDialog(null,"promedio  es"+ prom);
                    break;

                case 11:
                    float sumag = 0,sumap = 0,n1=0;
                    int count1 = 0;
                    String x4 = JOptionPane.showInputDialog(null, "ingrese agignatura para mirar el procentaje: ");
                    for (int j = 0; j < lista_Estudiantes.size(); j++) {
                        n1 = lista_Estudiantes.get(j).getNota();
                        String materiax4 = lista_Estudiantes.get(j).getMateria();
                        if (materiax4.equals(x4)) {
                            if (n1>=3.0){
                                sumag += 1;
                            }else{
                                sumap += 1;
                            }
                            count1+=1;
                        }
                        //System.out.println(n);
                        //JOptionPane.showMessageDialog(null,"acumulador g"+ n);
                    }

                    float porceg = (sumag*100)/count1;
                    float porcep = (sumap*100)/count1;
                    JOptionPane.showMessageDialog(null,"porcentaje ganado es"+ porceg);
                    JOptionPane.showMessageDialog(null,"porcentaje perdido es"+ porcep);


                    break;

                case 12:
                    System.exit(0);

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida\n", "Error Opcion",
                            JOptionPane.WARNING_MESSAGE);
            }

        } while (opcion != 12);
    }
}
