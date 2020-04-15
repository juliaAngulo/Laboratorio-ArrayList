package arraylistinterfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfaz extends JFrame implements ActionListener {

    JPanel p1, p2, p3;
    JLabel l1, l2, l3, l4, l5, l6,l7;
    JTextField t1, t2, t3, t4, t5,t6;
    JButton b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;

    public Interfaz() {
        l1 = new JLabel("Peliculas: ");
        b3 = new JButton("1");
        b3.addActionListener(this);
        b4 = new JButton("2");
        b4.addActionListener(this);
        b5 = new JButton("3");
        b5.addActionListener(this);
        b6 = new JButton("4");
        b6.addActionListener(this);
        b7 = new JButton("5");
        b7.addActionListener(this);
        b8 = new JButton("6");
        b8.addActionListener(this);
        b9 = new JButton("7");
        b9.addActionListener(this);
        b10 = new JButton("8");
        b10.addActionListener(this);
        b11 = new JButton("9");
        b11.addActionListener(this);
        b12 = new JButton("10");
        b12.addActionListener(this);
        l2 = new JLabel("Nombre: ");
        t1 = new JTextField(13);
        l3 = new JLabel("Director: ");
        t2 = new JTextField(14);
        l4 = new JLabel("Año de estreno: ");
        t3 = new JTextField(3);
        l5 = new JLabel("Reseña: ");
        t4 = new JTextField(200);
        l6 = new JLabel("¿Cuantas entradas desea comprar?");
        t5 = new JTextField(3);
        b2 = new JButton("Vender entrada");
        l7=new JLabel("Total"); 
        t6=new JTextField(4); 
        setLayout(new BorderLayout());
        setBounds(800, 800, 800, 800);
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(l1);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b10);
        p1.add(b11);
        p1.add(b12);
        add(p1, BorderLayout.NORTH);
        setBounds(400, 200, 600, 300);
        p2 = new JPanel();
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(t2);
        p2.add(l4);
        p2.add(t3);
        p2.add(l5);
        p2.add(t4);
        add(p2, BorderLayout.CENTER);
        setBounds(400, 100, 600, 300);
        p3 = new JPanel();
        p3.add(l6);
        p3.add(t5);
        p3.add(b2);
        p3.add(l7);
        p3.add(t6);
        add(p3, BorderLayout.SOUTH);
        setBounds(400, 200, 600, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String nombre1, resena1, director1;
        int anio1;
       
        if (ae.getActionCommand().equalsIgnoreCase("1")) {
            nombre1 = obtencionNombre(1);
            t1.setText((nombre1));
            
            director1=obtenerDirector(1);
            t2.setText((director1));
            
            anio1=obtenerAño(1);
            t3.setText((String.valueOf(anio1)));
            
            resena1=obtenerReseña(1); 
            t4.setText((resena1));
            
        } else if (ae.getActionCommand().equalsIgnoreCase("2")) {
            nombre1 = obtencionNombre(2);
            t1.setText((nombre1));
            
            director1=obtenerDirector(2);
            t2.setText((director1));
            
            anio1=obtenerAño(2);
            t3.setText((String.valueOf(anio1)));
            
            resena1=obtenerReseña(2); 
            t4.setText((resena1));

        } else if (ae.getActionCommand().equalsIgnoreCase("3")) {
            nombre1 = obtencionNombre(3);
            t1.setText((nombre1));
            
            director1=obtenerDirector(3);
            t2.setText((director1));
            
            anio1=obtenerAño(3);
            t3.setText((String.valueOf(anio1)));
            
            resena1=obtenerReseña(3); 
            t4.setText((resena1));

        } else if (ae.getActionCommand().equalsIgnoreCase("4")) {
            nombre1 = obtencionNombre(4);
            t1.setText((nombre1));
            
            director1=obtenerDirector(4);
            t2.setText((director1));
            
            anio1=obtenerAño(4);
            t3.setText((String.valueOf(anio1)));
            
            resena1=obtenerReseña(4); 
            t4.setText((resena1));

        } else if (ae.getActionCommand().equalsIgnoreCase("5")) {
            nombre1 = obtencionNombre(5);
            t1.setText((nombre1));
            
            director1=obtenerDirector(5);
            t2.setText((director1));
            
            anio1=obtenerAño(5);
            t3.setText((String.valueOf(anio1)));
            
            resena1=obtenerReseña(5); 
            t4.setText((resena1));

        } else if (ae.getActionCommand().equalsIgnoreCase("6")) {
            nombre1 = obtencionNombre(6);
            t1.setText((nombre1));
            
            director1=obtenerDirector(6);
            t2.setText((director1));
            
            anio1=obtenerAño(6);
            t3.setText((String.valueOf(anio1)));
            
            resena1=obtenerReseña(6); 
            t4.setText((resena1));

        } else if (ae.getActionCommand().equalsIgnoreCase("7")) {
            nombre1 = obtencionNombre(7);
            t1.setText((nombre1));
            
            director1=obtenerDirector(7);
            t2.setText((director1));
            
            anio1=obtenerAño(7);
            t3.setText((String.valueOf(anio1)));
            
            resena1=obtenerReseña(7); 
            t4.setText((resena1));

        } else if (ae.getActionCommand().equalsIgnoreCase("8")) {
            nombre1 = obtencionNombre(8);
            t1.setText((nombre1));
            
            director1=obtenerDirector(8);
            t2.setText((director1));
            
            anio1=obtenerAño(8);
            t3.setText((String.valueOf(anio1)));
            
            resena1=obtenerReseña(8); 
            t4.setText((resena1));

        } else if (ae.getActionCommand().equalsIgnoreCase("9")) {
            nombre1 = obtencionNombre(9);
            t1.setText((nombre1));
            
            director1=obtenerDirector(9);
            t2.setText((director1));
            
            anio1=obtenerAño(9);
            t3.setText((String.valueOf(anio1)));
            
            resena1=obtenerReseña(9); 
            t4.setText((resena1));

        } else {
            nombre1 = obtencionNombre(10);
            t1.setText((nombre1));
            
            director1=obtenerDirector(10);
            t2.setText((director1));
            
            anio1=obtenerAño(10);
            t3.setText((String.valueOf(anio1)));
            
            resena1=obtenerReseña(10); 
            t4.setText((resena1));

        }
 
        
    }

    public String obtencionNombre(int valor) {
        int valor1;
        valor1 = valor;
        String nombre = "Hola";
        Nombre after = new Nombre("After");
        Nombre aladdin = new Nombre("Aladdin");
        Nombre avengers = new Nombre("Avengers End Game");
        Nombre boys = new Nombre("Bad Boys para siempre");
        Nombre guason = new Nombre("El Guason");
        Nombre dolittle = new Nombre("Doctor Dolittle");
        Nombre land = new Nombre("La la land");
        Nombre rapidos = new Nombre("Rapidos y furiosos 8");
        Nombre sonic = new Nombre("Sonic");
        Nombre titanic = new Nombre("Mulan");

        ArrayList lista = new ArrayList();

        lista.add(after);
        lista.add(aladdin);
        lista.add(avengers);
        lista.add(boys);
        lista.add(guason);
        lista.add(dolittle);
        lista.add(land);
        lista.add(rapidos);
        lista.add(sonic);
        lista.add(titanic);

        //System.out.println(" Peliculas: " + lista.size());

        Iterator it2 = lista.iterator();
        while (it2.hasNext()) {
            switch (valor1) {
                case 1:
                    nombre = after.getNombre();
                    break;
                case 2:
                    nombre = aladdin.getNombre();
                    break;
                case 3:
                    nombre = avengers.getNombre();
                    break;
                case 4:
                    nombre = boys.getNombre();
                    break;
                case 5:
                    nombre = guason.getNombre();
                    break;
                case 6:
                    nombre = dolittle.getNombre();
                    break;
                case 7:
                    nombre = land.getNombre();
                    break;
                case 8:
                    nombre = rapidos.getNombre();
                    break;
                case 9:
                    nombre = sonic.getNombre();
                    break;
                case 10:
                    nombre = titanic.getNombre();
                    break;
            }
            Nombre producto = (Nombre) it2.next();
            //System.out.println(producto);
        }

        return nombre;

    }
    public String obtenerDirector(int valor){
        int valor1;
        valor1 = valor;
        String director = "Hola";
        Director after = new Director("Jenny Gage");
        Director aladdin = new Director("Guy Ritchie");
        Director avengers = new Director("Joe Russo, Anthony Russo");
        Director boys = new Director("Bilall Fallah, Adil El Arbi");
        Director guason = new Director("Todd Phillips");
        Director dolittle = new Director("Stephen Gaghan");
        Director land = new Director("Damien Chazelle");
        Director rapidos = new Director("F. Gary Gray");
        Director sonic = new Director("Jeff Fowler");
        Director titanic = new Director("Niki Caro");

        ArrayList lista1 = new ArrayList();

        lista1.add(after);
        lista1.add(aladdin);
        lista1.add(avengers);
        lista1.add(boys);
        lista1.add(guason);
        lista1.add(dolittle);
        lista1.add(land);
        lista1.add(rapidos);
        lista1.add(sonic);
        lista1.add(titanic);

        //System.out.println(" Peliculas: " + lista1.size());

        Iterator it2 = lista1.iterator();
        while (it2.hasNext()) {
            switch (valor1) {
                case 1:
                    director = after.getDirector();
                    break;
                case 2:
                    director = aladdin.getDirector();
                    break;
                case 3:
                    director = avengers.getDirector();
                    break;
                case 4:
                    director = boys.getDirector();
                    break;
                case 5:
                    director = guason.getDirector();
                    break;
                case 6:
                    director = dolittle.getDirector();
                    break;
                case 7:
                    director = land.getDirector();
                    break;
                case 8:
                    director = rapidos.getDirector();
                    break;
                case 9:
                    director = sonic.getDirector();
                    break;
                case 10:
                    director = titanic.getDirector();
                    break;
            }
            Director producto = (Director) it2.next();
            //System.out.println(producto);
        }

        return director;

    }
    public int obtenerAño(int valor){
        int valor1;
        valor1 = valor;
        int anio = 0; 
        Anio after = new Anio(2019);
        Anio aladdin = new Anio(2019);
        Anio avengers = new Anio(2019);
        Anio boys = new Anio(2020);
        Anio guason = new Anio(2019);
        Anio dolittle = new Anio(2020);
        Anio land = new Anio(2016);
        Anio rapidos = new Anio(2017);
        Anio sonic = new Anio(2020);
        Anio titanic = new Anio(2020);

        ArrayList lista = new ArrayList();

        lista.add(after);
        lista.add(aladdin);
        lista.add(avengers);
        lista.add(boys);
        lista.add(guason);
        lista.add(dolittle);
        lista.add(land);
        lista.add(rapidos);
        lista.add(sonic);
        lista.add(titanic);

        //System.out.println(" Peliculas: " + lista.size());

        Iterator it2 = lista.iterator();
        while (it2.hasNext()) {
            switch (valor1) {
                case 1:
                    anio = after.getAnio();
                    break;
                case 2:
                    anio = aladdin.getAnio();
                    break;
                case 3:
                    anio = avengers.getAnio();
                    break;
                case 4:
                    anio = boys.getAnio();
                    break;
                case 5:
                    anio = guason.getAnio();
                    break;
                case 6:
                    anio = dolittle.getAnio();
                    break;
                case 7:
                    anio = land.getAnio();
                    break;
                case 8:
                    anio = rapidos.getAnio();
                    break;
                case 9:
                    anio = sonic.getAnio();
                    break;
                case 10:
                    anio = titanic.getAnio();
                    break;
            }
            Anio producto = (Anio) it2.next();
            //System.out.println(producto);
        }

        return anio; 
    }
    public String obtenerReseña(int valor){
        int valor1;
        valor1 = valor;
        String resena= "Hola";
        Reseña after = new Reseña("Tessa Young acaba de llegar a la universidad, y su estable y ordenada vida da un giro busco al conocer al misterioso Hardin Scott, cuyo pasado es algo oscuro. Aunque de entrada se odian, estos polos opuestos se unirán y nada volverá a ser como antes. Tendrán que enfrentarse amultiples pruebas como la inocencia y el descubrimiento sexual, para poder estar juntos.");
        Reseña aladdin = new Reseña("Aladdin es un ladronzuelo que se enamora de la hija del Sultán, la princesa Jasmine. Para poder conquistarla aceptará un desafío de Jafar. Aladdín tendrá que entrar en una cueva en mitad del desierto y conseguir una lámpara mágica que contiene al Genio que será el encargado de concederle todos sus deseos.");
        Reseña avengers = new Reseña("Los Vengadores restantes deben encontrar una manera de recuperar a sus aliados para un enfrentamiento épico con Thanos, el malvado que diezmó el planeta y el universo.");
        Reseña boys = new Reseña("Los policías de la vieja escuela Mike Lowery y Marcus Burnett vuelven a patrullar juntos para derrotar al líder vicioso de un cartel de drogas de Miami. El recién creado equipo de élite AMMO del departamento de policía de Miami junto con Mike y Marcus se enfrentan al despiadado Armando Armas.");
        Reseña guason = new Reseña("Arthur Fleck adora hacer reír a la gente, pero su carrera como comediante es un fracaso. El repudio social, la marginación y una serie de trágicos acontecimientos lo conducen por el sendero de la locura y, finalmente, cae en el mundo del crimen.");
        Reseña dolittle = new Reseña("El Dr. John Dolittle vive solo detrás de los muros de su exuberante mansión en la Inglaterra del siglo XIX. Su única compañía proviene de una variedad de animales exóticos con los que habla a diario. Pero cuando la joven reina Victoria se enferma gravemente, el médico excéntrico y sus amigos peludos se embarcan en una aventura épica en una isla mítica para encontrar la cura.");
        Reseña land = new Reseña("Sebastian, un pianista de jazz, y Mia, una aspirante a actriz, se enamoran locamente; pero la ambición desmedida que tienen por triunfar en sus respectivas carreras, en una ciudad como Los Ángeles, repleta de competencia y carente de piedad, pone en peligro su amor.");
        Reseña rapidos = new Reseña("Con Dom y Letty de luna de miel, Brian y Mia retirados y el resto de la pandilla viviendo en paz, parece que todo está tranquilo. Sin embargo, una misteriosa mujer seducirá a Dom para adentrarlo en el mundo del crimen y traicionar a la pandilla. Ahora tendrán que unirse para traer a casa al hombre que los convirtió en una familia y detener a Cipher de desatar el caos.");
        Reseña sonic = new Reseña("Sonic intenta navegar por las complejidades de la vida en la Tierra con su nuevo mejor amigo, un humano llamado Tom Wachowski. Pronto deben unir fuerzas para evitar que el malvado Dr. Robotnik capture a Sonic y use sus poderes para dominar el mundo.");
        Reseña titanic = new Reseña("El emperador chino emite un decreto que exige que cada hogar debe reclutar a un varón para luchar con el ejército imperial en la guerra contra los Hunos. Para salvar a su anciano padre de este deber, su única hija Fa Mulan se hace pasar por soldado y toma su lugar. La joven se someterá a un duro entrenamiento hasta hacerse merecedora de la estima y de la confianza del resto de su escuadrón.");

        ArrayList lista = new ArrayList();

        lista.add(after);
        lista.add(aladdin);
        lista.add(avengers);
        lista.add(boys);
        lista.add(guason);
        lista.add(dolittle);
        lista.add(land);
        lista.add(rapidos);
        lista.add(sonic);
        lista.add(titanic);

        //System.out.println(" Peliculas: " + lista.size());

        Iterator it2 = lista.iterator();
        while (it2.hasNext()) {
            switch (valor1) {
                case 1:
                    resena = after.getReseña();
                    break;
                case 2:
                    resena = aladdin.getReseña();
                    break;
                case 3:
                    resena = avengers.getReseña();
                    break;
                case 4:
                    resena = boys.getReseña();
                    break;
                case 5:
                    resena = guason.getReseña();
                    break;
                case 6:
                    resena = dolittle.getReseña();
                    break;
                case 7:
                    resena = land.getReseña();
                    break;
                case 8:
                    resena = rapidos.getReseña();
                    break;
                case 9:
                    resena = sonic.getReseña();
                    break;
                case 10:
                    resena = titanic.getReseña();
                    break;
            }
            Reseña producto = (Reseña) it2.next();
            //System.out.println(producto);
        }

        return resena; 
    }
    public int calcularTotalEntradas(int entradas){
        int entradas1=0;
        entradas1+=entradas; 
        return entradas1; 
    }
 

}
