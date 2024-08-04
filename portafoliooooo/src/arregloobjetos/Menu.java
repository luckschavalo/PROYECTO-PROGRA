package arregloobjetos;
import javax.swing.JOptionPane;
public class Menu {
   private byte opc;
   //el funcionamineto del menu y su intnerfas
   public void mostrarMenu(){
      Rutina r=new Rutina();
      while(opc!=4){ 
         opc=Byte.parseByte(JOptionPane.showInputDialog(null, """
                                                              ***MEN\u00da PRINCIPAL***
                                                              
                                                              1.Codigo producto
                                                              2.Completar inventario
                                                              3.Mostrar productos
                                                              4.Salir
                                                              
                                                              Digite su opci\u00f3n:"""));
         switch(opc){
             case 1 -> {
                r.agregar();
             }
             case 2 -> {
                r.completar();
             }
             case 3 -> {
                r.mostrar();
             }
             case 4 -> {
                System.exit(0);
             }
             default -> {
                JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
             }
         }
      }
   }
}
