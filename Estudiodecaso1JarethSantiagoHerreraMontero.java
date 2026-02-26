/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiodecaso1jarethsantiagoherreramontero;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Estudiodecaso1JarethSantiagoHerreraMontero {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int PuntoLeal = 0;
        int Yupo = 0;
        int carn = 0;
        String Nombre = JOptionPane.showInputDialog("Bienvenido al sistema de gestion \n"
                + "Porfavor ingrese su nombre");

        String CedulaS = JOptionPane.showInputDialog("Ingrese su numero de cedula");

        String TelefonoS = JOptionPane.showInputDialog("Ingrese su numero de telefono");

        int Cedula = Integer.parseInt(CedulaS);
        int Telefono = Integer.parseInt(TelefonoS);

        String ServicioS = JOptionPane.showInputDialog("Ingrese si es un cliente VIP apretando el 1 o Regular apretando el 2");
        int Servicio = Integer.parseInt(ServicioS);

        if (Servicio == 1 || Servicio == 2) {

            while (Yupo <= 10) {
                String ValorS = JOptionPane.showInputDialog("Ingrese el numero de mes en el que se realizaron los alquileres");
                int Valor = Integer.parseInt(ValorS);
                if (Valor <= 12) {
                    Yupo = Yupo + 10000;
                    String NumCars = JOptionPane.showInputDialog("Ingrese el numero de carros que alquilo");
                    int NumCar = Integer.parseInt(NumCars);

                    if (NumCar > 0) {

                        for (int i = 0; i < NumCar; i++) {
                            String Placas = JOptionPane.showInputDialog("Ingrese la placa del vehiculo");
                            String Marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
                            String Precios = JOptionPane.showInputDialog("Ingrese el precio del vehiculo");
                            int Precio = Integer.parseInt(Precios);

                            String Dias = JOptionPane.showInputDialog("Ingrese la cantidad de dias de alquiler");
                            int Dia = Integer.parseInt(Dias);
                            if (Dia > 0) {
                                if (Dia >= 7) {
                                    int Pricio = (int) (Precio * 0.15);
                                    int Prunto = Precio - Pricio;
                                    JOptionPane.showConfirmDialog(null, "Se ha aplicado un 15% descuento");
                                    JOptionPane.showConfirmDialog(null, "Precio con descuento =" + Prunto);
                                    PuntoLeal = PuntoLeal + 5;
                                    String Alquilers = JOptionPane.showInputDialog("Quiere incluir seguro completo? Ingrese 1 si si, y 2 si no");
                                    int Alquiler = Integer.parseInt(Alquilers);

                                    if (Alquiler == 1 || Alquiler == 2) {
                                        if (Alquiler == 1) {
                                            int ALQDIA = 5000 * Dia;
                                            int Prucio = Prunto + ALQDIA;
                                            PuntoLeal = PuntoLeal + 2;
                                            JOptionPane.showConfirmDialog(null, "Precio con alquiler es =" + Prucio);

                                            String GPSS = JOptionPane.showInputDialog("Quiere incluir GPS? Ingrese 1 si si, y 2 si no");
                                            int GPS = Integer.parseInt(GPSS);

                                            if (GPS == 1 || GPS == 2) {
                                                if (GPS == 1) {
                                                    int GPSDIA = 2000 * Dia;
                                                    int Pracio = Prucio + GPSDIA;
                                                    JOptionPane.showConfirmDialog(null, "Precio con GPS es =" + Pracio);

                                                } else {
                                                    int Pracio = Prucio;
                                                    JOptionPane.showConfirmDialog(null, "Precio sin alquiler es =" + Prucio);
                                                }
                                            }

                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Numero ingresado no valido");

                                    }
                                }

                            } else {
                                if (Dia >= 7) {
                                    int Pricio = (int) (Precio * 0.15);
                                    int Prunto = Precio - Pricio;
                                    JOptionPane.showConfirmDialog(null, "Se ha aplicado un 15% descuento");
                                    JOptionPane.showConfirmDialog(null, "Precio con descuento =" + Prunto);
                                    PuntoLeal = PuntoLeal + 5;
                                    int Prucio = Prunto;

                                    String GPSS = JOptionPane.showInputDialog("Quiere incluir GPS? Ingrese 1 si si, y 2 si no");
                                    int GPS = Integer.parseInt(GPSS);

                                    if (GPS == 1 || GPS == 2) {
                                        if (GPS == 1) {
                                            int GPSDIA = 2000 * Dia;
                                            int Pracio = Prucio + GPSDIA;
                                            JOptionPane.showConfirmDialog(null, "Precio con GPS es =" + Pracio);

                                        } else {
                                            int Pracio = Prucio;
                                            JOptionPane.showConfirmDialog(null, "Precio sin GPS es =" + Prucio);
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Numero de carros no valido");
                                    }

                                } else {

                                    JOptionPane.showMessageDialog(null, "Mes no valido");

                                }
                            }

                        }
                    } else {
                        JOptionPane.showConfirmDialog(null, "Servicio no valido");
                    }

                }
            }
            } else {
                        JOptionPane.showConfirmDialog(null, "Servicio no valido");
        }
        }
        }
        
    
    

