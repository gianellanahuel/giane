public class mundoPC {
    public static void main(String[] args){
        Monitor monitorHP = new Monitor("HP" ,13);//Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("Bluetooth","HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP,tecladoHP,ratonHP);
        
      
        //Creamos otros objetos de diferentes marcas
        Monitor monitorGamer = new Monitor("Gamer" , 32);
        Teclado tecladoGamer = new Teclado("Bluetooth","Gamer");
        Raton ratonGamer = new Raton("Bluetooth","Gamer");
   
        
        Computadora computadoraGamer = new Computadora("Computadora Gamer ", monitorGamer,tecladoGamer,ratonGamer);
        
        Orden orden1 = new Orden();//Inicializamos el arreglo vacio
        Orden orden2 = new Orden();//Una nueva lista para el objeto orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        Computadora computadoraVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadoraVarias);
        
        
        //Tarea pedida en los videos
        Orden orden3 = new Orden();
        Monitor monitorSamsung = new Monitor("Samsung" , 64);
        Teclado tecladoSamsung = new Teclado("Bluetooth","Samsung");
        Raton ratonSamsung = new Raton("Bluetooth","Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung,tecladoSamsung,ratonSamsung);
        orden3.agregarComputadora(computadoraSamsung);
        
        Orden orden4 = new Orden();
        Monitor monitorDell = new Monitor("Dell" , 15);
        Teclado tecladoDell = new Teclado("Bluetooth","Dell");
        Raton ratonDell = new Raton("Bluetooth","Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell,tecladoDell,ratonDell);
        orden4.agregarComputadora(computadoraDell);
        
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();
        orden4.mostrarOrden();
        
    }
} 
