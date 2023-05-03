import javax.swing.JOptionPane;
	

	public class trabajo {
		static int n= Integer.parseInt(JOptionPane.showInputDialog("longitud del arreglo de nombres y edad:"));
		private static String[] nombreArray = new String[n];
	    private static int[] edadArray = new int[n];
	    private static int numeroEstudiantes = 0;
	   
	    private static int carta() {
	        String menu = "Menu de interacciones:\n"
	                + "1. Registro\n"
	                + "2. Imprimir lista \n"
	                + "3. Promedio de edades\n"
	                + "4. Estudiante mayor \n"
	                + "5. Estudiante menor\n"
	                + "6. Estudiantes mayores de edad\n"
	                + "7. Buscar por nombre\n"
	                + "8. Buscar por edad\n"
	                + "9. Salir";
	        String opcionMenu = JOptionPane.showInputDialog(null, menu);
	        return Integer.parseInt(opcionMenu);
	    

	}

	    public static void main(String[] args) {
	        int opcionMenu = 0;
	        do {
	            opcionMenu = carta();
	            switch (opcionMenu) {
	                case 1:
	                	String nombre = JOptionPane.showInputDialog(null, "Nombre del estudiante:");
	                    int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad del estudiante:"));
	                    nombreArray[numeroEstudiantes] = nombre;
	                    edadArray[numeroEstudiantes] = edad;
	                    numeroEstudiantes++;
	                    
	                    break;
	                case 2:
	                	String lista = "Lista de estudiantes:\n";
	                    for (int i = 0; i < numeroEstudiantes; i++) {
	                        lista += nombreArray[i] + " - " + edadArray[i] + "\n";
	                    }
	                    JOptionPane.showMessageDialog(null, lista);
	                    break;
	                case 3:
	                    int sumaEdades = 0;
	                    for (int i = 0; i < numeroEstudiantes; i++) {
	                        sumaEdades += edadArray[i];
	                    }
	                    double promedio = (double) sumaEdades / numeroEstudiantes;
	                    JOptionPane.showMessageDialog(null, "El promedio de edades es: " + promedio);
	                    break;
	                case 4:
	                	int maximaEdad = 18;
	                    for (int i = 0; i < numeroEstudiantes; i++) {
	                        if (edadArray[i] > maximaEdad) {
	                            maximaEdad = edadArray[i];
	                        }
	                    }
	                    String estudiantes = "Estudiantes de mayor edad:\n";
	                    for (int i = 0; i < numeroEstudiantes; i++) {
	                        if (edadArray[i] == maximaEdad) {
	                            estudiantes += nombreArray[i] + " - " + edadArray[i] + "\n";
	                        }
	                    }
	                    
	                    JOptionPane.showMessageDialog(null, estudiantes);
	                    break;
	                case 5:
	                	int edadMinima = 18;
	                    for (int i = 0; i < numeroEstudiantes; i++) {
	                        if (edadArray[i] <= edadMinima) {
	                        	edadMinima = edadArray[i];
	                        }
	                    }
	                    String mensaje = "Estudiantes de menor edad:\n";
	                    for (int i = 0; i < numeroEstudiantes; i++) {
	                        if (edadArray[i] == edadMinima) {
	                            mensaje += nombreArray[i] + " - " + edadArray[i] + "\n";
	                        }
	                    }
	                    JOptionPane.showMessageDialog(null, mensaje);
	                    break;
	                case 6:
	                	int contador = 0;
	                    for (int i = 0; i < numeroEstudiantes; i++) {
	                        if (edadArray[i] >= 18) {
	                            contador++;
	                        }
	                    }
	                    JOptionPane.showMessageDialog(null, "Hay " + contador + " estudiantes mayores de edad.");
	                    break;
	                case 7:
	                	String nombre1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante a buscar:");
	                    int indice = -1;
	                    for (int i = 0; i < numeroEstudiantes; i++) {
	                        if (nombreArray[i].equalsIgnoreCase(nombre1)) {
	                            indice = i;
	                            break;
	                        }
	                    }
	                    if (indice == -1) {
	                        JOptionPane.showMessageDialog(null, "No se encontró ningún estudiante con ese nombre.");
	                    } else {
	                        JOptionPane.showMessageDialog(null, "El estudiante encontrado es: " + nombreArray[indice] + " - " + edadArray[indice]);
	                    }
	                    break;
	                case 8:
	                	int edad1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de los estudiantes a buscar:"));
	                    String estudiantes1 = "Estudiantes con edad " + edad1 + ":\n";
	                    for (int i = 0; i < numeroEstudiantes; i++) {
	                        if (edadArray[i] == edad1) {
	                            estudiantes1 += nombreArray[i] + " - " + edadArray[i] + "\n";
	                        }
	                    }
	                    JOptionPane.showMessageDialog(null, estudiantes1);
	                    break;
	                case 9:
	                    JOptionPane.showMessageDialog(null, "Gracias por usar el codigo");
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "No es un numero valido");
	            }
	        } while (opcionMenu != 9);
	    }


	


}
