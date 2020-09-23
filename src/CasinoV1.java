
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class CasinoV1 extends javax.swing.JFrame {

    /**
     * Creates new form CasinoV1
     */
    int intentos = 0;   //VARIABLE GLOBAL DE INTENTOS
    double monedas = 0; //VARIABLE GLOBAL DE MONEDAS
    int intentos_totales = 0;
    int puntos = 0;
    public CasinoV1() {
        JOptionPane.showMessageDialog(null, "Este programa es un MiniCasino\n" //VENTANA DE SALUDO
                + "¡¡¡Si te toca el mismo personaje 3 veces te llevarás un premio!!!\n"
                + "R E G L A S :\n1. Cada tirada cuesta 5 monedas\n"
                + "2. Si te sobran monedas, se acumularán por si quieres seguir jugando\n"
                + "3. ¡¡Ten un buen rato de diversión!!", "B I E N V E N I D O", JOptionPane.PLAIN_MESSAGE);
        String cant = JOptionPane.showInputDialog(null, "Ingrese la cantidad de monedas:", "I N G R E S A R", JOptionPane.PLAIN_MESSAGE);
        try {
            monedas = Double.parseDouble(cant);  //INGRESANDO CANTIDAD DE MONEDAS
        } catch (Exception e) {
            do {
                JOptionPane.showMessageDialog(
                        null, "Has introducido una letra, tienes que colocar numeros",
                        "E R R O R",
                        JOptionPane.ERROR_MESSAGE);
                cant = JOptionPane.showInputDialog(null, "Ingrese la cantidad de monedas:", "I N G R E S A R", JOptionPane.PLAIN_MESSAGE);
            } while (false);
        }
        if (monedas < 5) {    //HACER QUE INGRESE AL MENOS 5 MONEDAS
            do {
                JOptionPane.showMessageDialog(null, "Debe ingresar al menos 5 monedas para tomar sus turnos", " Q U E   T E   P A S A ?", JOptionPane.PLAIN_MESSAGE);
                cant = JOptionPane.showInputDialog(null, "Ingrese la cantidad de monedas:", "I N G R E S A R", JOptionPane.PLAIN_MESSAGE);
                monedas = Double.parseDouble(cant);
            } while (monedas < 5);
        }

        while (monedas >= 5) {  //POR CADA 5 MONEDAS RESTADAS SUMAR UN INTENTO
            intentos++;
            monedas = monedas - 5;
        }
        intentos_totales = intentos;    //GUARDAR LOS INTENTOS TOTALES
        JOptionPane.showMessageDialog(null, "Te sobran " + monedas + " monedas\nTienes " + intentos + " intentos", "R E C U R S O S", JOptionPane.PLAIN_MESSAGE);  //MOSTRAR MONEDAS E INTENTOS
        JOptionPane.showMessageDialog(null, "A continuacion, te mostraremos como funciona nuestro sistema de premios.\nFunciona de la siguiente forma: Al finalizar tus intentos, se te preguntara"
                + " si deseas convertir tus puntos en mas intentos para seguir\njugando, cada intento equivale a 25 puntos, por tanto, si seleccionas 'Si', se te sumara los intentos y se te restaran los puntos.\n"
                + "De lo contrario, si presionas 'No' te mostrara los premios que tienes disponibles",
                "P R E M I O S",
                JOptionPane.PLAIN_MESSAGE);
        initComponents();

        this.setLocationRelativeTo(null);   //SITUAR Y COLOREAR EL JFRAME
        this.getContentPane().setBackground(new Color(255, 0, 0));

        int ancho = 35; //REDIMENSIONAR ICONOS DE LOS BOTONES Y APLICARLOS
        int alto = 35;

        ImageIcon BotonJugar = new ImageIcon(getClass().getResource("/IMAGENES/JUGAR.png"));
        ImageIcon BTNJugar = new ImageIcon(BotonJugar.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
        jbtnJugar.setIcon(BTNJugar);

        ImageIcon BotonBorrar = new ImageIcon(getClass().getResource("/IMAGENES/COMODIN.png"));
        ImageIcon BTNBorrar = new ImageIcon(BotonBorrar.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
        jbtnComodin.setIcon(BTNBorrar);

        ImageIcon BotonSalir = new ImageIcon(getClass().getResource("/IMAGENES/CERRAR.png"));
        ImageIcon BTNSalir = new ImageIcon(BotonSalir.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
        jbtnSalir.setIcon(BTNSalir);

        jlblC1.setBorder(BorderFactory.createLineBorder(Color.BLACK));  // BORDES EN LABELS
        jlblC2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jlblC3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jlblC4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jlblC5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jlblC6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jlblC7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jlblC8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jlblC9.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        ImageIcon img1 = new ImageIcon(getClass().getResource("IMAGENES/BoJackHorseman.png")); //BoJack
        ImageIcon icn1 = new ImageIcon(img1.getImage().getScaledInstance(jlblC1.getWidth(), jlblC1.getHeight(), Image.SCALE_DEFAULT));
        jlblC1.setIcon(icn1);
        jlblC2.setIcon(icn1);
        jlblC3.setIcon(icn1);

        ImageIcon img2 = new ImageIcon(getClass().getResource("IMAGENES/Heisenberg.png")); //Heisenberg
        ImageIcon icn2 = new ImageIcon(img2.getImage().getScaledInstance(jlblC1.getWidth(), jlblC1.getHeight(), Image.SCALE_DEFAULT));
        jlblC4.setIcon(icn2);
        jlblC5.setIcon(icn2);
        jlblC6.setIcon(icn2);

        ImageIcon img3 = new ImageIcon(getClass().getResource("IMAGENES/RickSanchez.png")); //Rick
        ImageIcon icn3 = new ImageIcon(img3.getImage().getScaledInstance(jlblC1.getWidth(), jlblC1.getHeight(), Image.SCALE_DEFAULT));
        jlblC7.setIcon(icn3);
        jlblC8.setIcon(icn3);
        jlblC9.setIcon(icn3);

        jlblC1.setVisible(false);   //ESCONDER LABELS
        jlblC2.setVisible(false);
        jlblC3.setVisible(false);
        jlblC4.setVisible(false);
        jlblC5.setVisible(false);
        jlblC6.setVisible(false);
        jlblC7.setVisible(false);
        jlblC8.setVisible(false);
        jlblC9.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblTitulo = new javax.swing.JLabel();
        jlblC1 = new javax.swing.JLabel();
        jlblC4 = new javax.swing.JLabel();
        jlblC7 = new javax.swing.JLabel();
        jlblC2 = new javax.swing.JLabel();
        jlblC5 = new javax.swing.JLabel();
        jlblC8 = new javax.swing.JLabel();
        jlblC3 = new javax.swing.JLabel();
        jlblC6 = new javax.swing.JLabel();
        jlblC9 = new javax.swing.JLabel();
        jbtnJugar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jbtnComodin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblTitulo.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(255, 204, 0));
        jlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitulo.setText("C A S I N O   D E   A G R I P I N O ");
        getContentPane().add(jlblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 411, -1));

        jlblC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BoJackHorseman.png"))); // NOI18N
        jlblC1.setText("1");
        getContentPane().add(jlblC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 121, 169));

        jlblC4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Heisenberg.png"))); // NOI18N
        jlblC4.setText("4");
        getContentPane().add(jlblC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 121, 169));

        jlblC7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/RickSanchez.png"))); // NOI18N
        jlblC7.setText("7");
        getContentPane().add(jlblC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 121, 169));

        jlblC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BoJackHorseman.png"))); // NOI18N
        jlblC2.setText("2");
        getContentPane().add(jlblC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 121, 169));

        jlblC5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Heisenberg.png"))); // NOI18N
        jlblC5.setText("5");
        getContentPane().add(jlblC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 121, 169));

        jlblC8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/RickSanchez.png"))); // NOI18N
        jlblC8.setText("8");
        getContentPane().add(jlblC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 121, 169));

        jlblC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BoJackHorseman.png"))); // NOI18N
        jlblC3.setText("3");
        getContentPane().add(jlblC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 121, 169));

        jlblC6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Heisenberg.png"))); // NOI18N
        jlblC6.setText("6");
        getContentPane().add(jlblC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 121, 169));

        jlblC9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/RickSanchez.png"))); // NOI18N
        jlblC9.setText("9");
        getContentPane().add(jlblC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 121, 169));

        jbtnJugar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbtnJugar.setText("JUGAR");
        jbtnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 121, 50));

        jbtnSalir.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 121, 50));

        jbtnComodin.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbtnComodin.setText("COMODÍN");
        jbtnComodin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnComodinActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnComodin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 121, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double r; //VARIABLE GLOBAL DE RESIDUO
    private void jbtnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnJugarActionPerformed
        r = monedas; // ASIGNAR LAS MONEDAS QUE QUEDARON AL RESIDUO
        intentos--; // RESTAR UN INTENTO
        jlblC1.setVisible(false); //ESCONDER LABELS
        jlblC2.setVisible(false);
        jlblC3.setVisible(false);
        jlblC4.setVisible(false);
        jlblC5.setVisible(false);
        jlblC6.setVisible(false);
        jlblC7.setVisible(false);
        jlblC8.setVisible(false);
        jlblC9.setVisible(false);

        JLabel[] lbls1 = {jlblC1, jlblC4, jlblC7};    //CREACION DE LAS 3 RULETAS
        JLabel[] lbls2 = {jlblC2, jlblC5, jlblC8};
        JLabel[] lbls3 = {jlblC3, jlblC6, jlblC9};

        int i = (int) (Math.random() * 3);    //RANDOMIZAR Y MOSTRAR
        lbls1[i].setVisible(true);

        int j = (int) (Math.random() * 3);
        lbls2[j].setVisible(true);

        int k = (int) (Math.random() * 3);
        lbls3[k].setVisible(true);

        if ((jlblC1.isVisible() && jlblC2.isVisible() && jlblC3.isVisible())){   //PARA EL GANADOR
            JOptionPane.showMessageDialog(null, "¡Has ganado 25 puntos!", "P U N T O S", JOptionPane.PLAIN_MESSAGE);
            puntos = puntos + 25;
        }
        if ((jlblC4.isVisible() && jlblC5.isVisible() && jlblC6.isVisible())){
            JOptionPane.showMessageDialog(null, "¡Has ganado 100 puntos, Excelente!", "P U N T O S", JOptionPane.PLAIN_MESSAGE);
            puntos = puntos + 100;
        }
        if ((jlblC7.isVisible() && jlblC8.isVisible() && jlblC9.isVisible())){
            JOptionPane.showMessageDialog(null, "¡Has Ganado 50 Puntos!", "P U N T O S", JOptionPane.PLAIN_MESSAGE);
            puntos = puntos +50;
        }
        if (intentos == 0) {    //PARA CUANDO SE ACABEN LOS INTENTOS
            int siono = JOptionPane.showConfirmDialog(null,
                     "Lo lamentamos mucho, solo tenías " + intentos_totales + " intentos y se han agotado.\n¿Desea ingresar más monedas?",
                     "M Á S   M O N E D A S ?",
                     JOptionPane.YES_NO_OPTION,
                     JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, "Los puntos que llevas acumulados son: "+puntos);
            if (siono == 0) {   //SI RESPONDE QUE QUIERE JUGAR DE NUEVO
                String cant = JOptionPane.showInputDialog(null, "Ingrese la cantidad de monedas:", "I N G R E S A R", JOptionPane.PLAIN_MESSAGE); //INGRESAR MONEDAS
                monedas = Double.parseDouble(cant);
                monedas = monedas + r;

                if (monedas < 5) {    //HACER QUE INGRESE AL MENOS 5 MONEDAS
                    do {
                        JOptionPane.showMessageDialog(null, "Debe ingresar al menos 5 monedas para tomar sus turnos", " Q U E   T E   P A S A ?", JOptionPane.PLAIN_MESSAGE);
                        cant = JOptionPane.showInputDialog(null, "Ingrese la cantidad de monedas:", "I N G R E S A R", JOptionPane.PLAIN_MESSAGE);
                        monedas = Double.parseDouble(cant);
                    } while (monedas < 5);
                }

                while (monedas >= 5) {  //POR CADA 5 MONEDAS RESTADAS SUMAR UN INTENTO
                    intentos++;
                    monedas = monedas - 5;
                }

                intentos_totales = intentos;    //GUARDAR LOS INTENTOS TOTALES
                JOptionPane.showConfirmDialog(null, "Te sobran " + monedas + " monedas\nTienes " + intentos + " intentos", "R E C U R S O S", JOptionPane.PLAIN_MESSAGE);

            } else { // SI RESPONDE QUE NO QUIERE JUGAR DE NUEVO
                if(puntos==0){
                    JOptionPane.showMessageDialog(null, "Lo siento, no has conseguido puntos. ¡Que mala suerte!\nEsperemos y vuelvas a jugar, ¡Hasta la proxima!",
                            "P I E R D E S",
                            JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                }
            int sj = JOptionPane.showConfirmDialog(null, "Has decidido retirarte, Los puntos que acumulaste fueron: "+puntos+ ".\nSi deseas convertir tus puntos\nen una tirada mas, presiona 'Si', cada 25 puntos es una tirada mas. De lo contrario,\nal presionar 'No', tus puntos se guardaran y te mostrara en que los puedes canjear\n¿Deseas convertir"
                    + " tus puntos en mas tiradas?", "F I N A L", JOptionPane.YES_NO_OPTION);
            if(sj==JOptionPane.YES_OPTION){
                while(puntos>=25){
                    intentos++;
                    puntos=puntos-25;
                    intentos_totales=intentos;
                }
                JOptionPane.showMessageDialog(null, "¡Se han convertido tus puntos en tiradas! Ahora tienes: "+intentos+" Intentos, aprovechalos.", "P U N T O S", JOptionPane.PLAIN_MESSAGE);
            }else{
                String pre = JOptionPane.showInputDialog(null, "Para reclamar un premio, introduce el numero del premio.\nLos premios son los siguientes: \n1.- "
                        + "Un pay de queso = 25 puntos.\n2.- Una mochila nueva = 150 puntos.\n3.- Entradas al cine = 250 puntos.\n"
                        + "4.- Juego de mesa = 950 puntos.\n5- Descuento del 50% en cualquier tienda = 1250 puntos",
                        "P R E M I O S",
                        JOptionPane.PLAIN_MESSAGE);
                int pre1=Integer.parseInt(pre);
                if((pre1==5 || pre1==4 || pre1==3 || pre1==2 || pre1==1) && puntos<=1249){
                        do{
                        JOptionPane.showMessageDialog(null, "Lo sentimos, no tienes suficientes puntos para este producto!", "E R R O R", JOptionPane.ERROR_MESSAGE);
                        pre = JOptionPane.showInputDialog(null, "Para reclamar un premio, introduce el numero del premio.\nLos premios son los siguientes: \n1.- "
                        + "Un pay de queso = 25 puntos.\n2.- Una mochila nueva = 150 puntos.\n3.- Entradas al cine = 250 puntos.\n"
                        + "4.- Juego de mesa = 950 puntos.\n5- Descuento del 50% en cualquier tienda = 1250 puntos",
                        "P R E M I O S",
                        JOptionPane.PLAIN_MESSAGE);
                pre1=Integer.parseInt(pre);
                        }while(pre1==5 || pre1==4 || pre1==3 || pre1==2 || pre1==1);
                }
                        if(pre1==5 && puntos>=1250){
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Te has llevado un Ticket de Descuento del 50% en cualquier tienda.", "P R E M I O", JOptionPane.PLAIN_MESSAGE);
                    puntos = puntos - 1250;
                    int puntosres = puntos;
                    JOptionPane.showMessageDialog(null, "Te sobraron: "+puntosres+" puntos. Se guardaran a tu tarjeta", "P U N T O S", JOptionPane.PLAIN_MESSAGE);
                        }
                        if((pre1==4 || pre1==3 || pre1==2 || pre1==1) && puntos<=949){
                        do{
                        JOptionPane.showMessageDialog(null, "Lo sentimos, no tienes suficientes puntos para este producto!", "E R R O R", JOptionPane.ERROR_MESSAGE);
                        pre = JOptionPane.showInputDialog(null, "Para reclamar un premio, introduce el numero del premio.\nLos premios son los siguientes: \n1.- "
                        + "Un pay de queso = 25 puntos.\n2.- Una mochila nueva = 150 puntos.\n3.- Entradas al cine = 250 puntos.\n"
                        + "4.- Juego de mesa = 950 puntos.\n5- Descuento del 50% en cualquier tienda = 1250 puntos",
                        "P R E M I O S",
                        JOptionPane.PLAIN_MESSAGE);
                pre1=Integer.parseInt(pre);
                        }while(pre1==4 || pre1==3 || pre1==2 || pre1==1);
                        }
                        if(pre1==4 && puntos>=950){
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Te has llevado un juego de mesa.", "P R E M I O", JOptionPane.PLAIN_MESSAGE);
                    puntos = puntos - 950;
                    int puntosres = puntos;
                    JOptionPane.showMessageDialog(null, "Te sobraron: "+puntosres+" puntos. Se guardaran a tu tarjeta", "P U N T O S", JOptionPane.PLAIN_MESSAGE);
                        }
                        if((pre1==3 || pre1==2 || pre1==1) && puntos<=249){
                        do{
                        JOptionPane.showMessageDialog(null, "Lo sentimos, no tienes suficientes puntos para este producto!", "E R R O R", JOptionPane.ERROR_MESSAGE);
                        pre = JOptionPane.showInputDialog(null, "Para reclamar un premio, introduce el numero del premio.\nLos premios son los siguientes: \n1.- "
                        + "Un pay de queso = 25 puntos.\n2.- Una mochila nueva = 150 puntos.\n3.- Entradas al cine = 250 puntos.\n"
                        + "4.- Juego de mesa = 950 puntos.\n5- Descuento del 50% en cualquier tienda = 1250 puntos",
                        "P R E M I O S",
                        JOptionPane.PLAIN_MESSAGE);
                pre1=Integer.parseInt(pre);
                        }while(pre1==3 || pre1==2 || pre1==1);
                        }
                        if(pre1==3 && puntos>=250){
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Te has llevado unas Entradas dobles al cine.", "P R E M I O", JOptionPane.PLAIN_MESSAGE);
                    puntos = puntos - 250;
                    int puntosres = puntos;
                    JOptionPane.showMessageDialog(null, "Te sobraron: "+puntosres+" puntos. Se guardaran a tu tarjeta", "P U N T O S", JOptionPane.PLAIN_MESSAGE);
                        }
                        if((pre1==2 || pre1==1) && puntos<=149){
                        do{
                        JOptionPane.showMessageDialog(null, "Lo sentimos, no tienes suficientes puntos para este producto!", "E R R O R", JOptionPane.ERROR_MESSAGE);
                        pre = JOptionPane.showInputDialog(null, "Para reclamar un premio, introduce el numero del premio.\nLos premios son los siguientes: \n1.- "
                        + "Un pay de queso = 25 puntos.\n2.- Una mochila nueva = 150 puntos.\n3.- Entradas al cine = 250 puntos.\n"
                        + "4.- Juego de mesa = 950 puntos.\n5- Descuento del 50% en cualquier tienda = 1250 puntos",
                        "P R E M I O S",
                        JOptionPane.PLAIN_MESSAGE);
                pre1=Integer.parseInt(pre);
                        }while(pre1==2 || pre1==1);
                        }
                        if(pre1==2 && puntos>=250){
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Te has llevado un juego de mesa.", "P R E M I O", JOptionPane.PLAIN_MESSAGE);
                    puntos = puntos - 250;
                    int puntosres = puntos;
                    JOptionPane.showMessageDialog(null, "Te sobraron: "+puntosres+" puntos. Se guardaran a tu tarjeta", "P U N T O S", JOptionPane.PLAIN_MESSAGE);
                        }
                    if((pre1==1) && puntos<=24){
                        do{
                        JOptionPane.showMessageDialog(null, "Lo sentimos, no tienes suficientes puntos para este producto!", "E R R O R", JOptionPane.ERROR_MESSAGE);
                        pre = JOptionPane.showInputDialog(null, "Para reclamar un premio, introduce el numero del premio.\nLos premios son los siguientes: \n1.- "
                        + "Un pay de queso = 25 puntos.\n2.- Una mochila nueva = 150 puntos.\n3.- Entradas al cine = 250 puntos.\n"
                        + "4.- Juego de mesa = 950 puntos.\n5- Descuento del 50% en cualquier tienda = 1250 puntos",
                        "P R E M I O S",
                        JOptionPane.PLAIN_MESSAGE);
                pre1=Integer.parseInt(pre);
                        }while(pre1==1);
                    }
                    if(pre1==1 && puntos>=25){
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Te has llevado un juego de mesa.", "P R E M I O", JOptionPane.PLAIN_MESSAGE);
                    puntos = puntos - 25;
                    int puntosres = puntos;
                    JOptionPane.showMessageDialog(null, "Te sobraron: "+puntosres+" puntos. Se guardaran a tu tarjeta", "P U N T O S", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                        }
                    }
                       
       
    }//GEN-LAST:event_jbtnJugarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        System.exit(0); //SALIR DEL PROGRAMA
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnComodinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnComodinActionPerformed
        int comodin = JOptionPane.showConfirmDialog(null, "Tienes uso de un comodin, usalo para poder ganar 100 puntos, al usarlo, perderas\n el comodin, pero ganaras 100 Puntos. ¡Usalo Bien!", "C O M O D I N", JOptionPane.YES_NO_OPTION);
        if(comodin==JOptionPane.YES_OPTION){
            jlblC1.setVisible(false);
            jlblC2.setVisible(false);
            jlblC3.setVisible(false);
            jlblC4.setVisible(true);
            jlblC5.setVisible(true);
            jlblC6.setVisible(true);
            jlblC7.setVisible(false);
            jlblC8.setVisible(false);
            jlblC9.setVisible(false);
            JOptionPane.showMessageDialog(null, "¡Has ganado 100 puntos, Excelente!", "P U N T O S", JOptionPane.PLAIN_MESSAGE);
            puntos = puntos + 100;
        }
    }//GEN-LAST:event_jbtnComodinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CasinoV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasinoV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasinoV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasinoV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CasinoV1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnComodin;
    private javax.swing.JButton jbtnJugar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlblC1;
    private javax.swing.JLabel jlblC2;
    private javax.swing.JLabel jlblC3;
    private javax.swing.JLabel jlblC4;
    private javax.swing.JLabel jlblC5;
    private javax.swing.JLabel jlblC6;
    private javax.swing.JLabel jlblC7;
    private javax.swing.JLabel jlblC8;
    private javax.swing.JLabel jlblC9;
    private javax.swing.JLabel jlblTitulo;
    // End of variables declaration//GEN-END:variables
}
