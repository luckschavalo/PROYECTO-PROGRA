package arregloobjetos;
import javax.swing.JOptionPane;
public class Rutina {
   private final Producto inventario[]=new Producto[6]; 
   //se preguntan las posibles opsiones
   public void agregar(){
      int x;
      for(x=0;x<3;x++){
          Producto p = new Producto();
          p.setCodigo(JOptionPane.showInputDialog(null, "Digite el código del producto:"));
          p.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del producto:"));
          p.setNombreEmpleado(JOptionPane.showInputDialog(null, "Digite el nombre del empleado que agregó el producto:"));
          p.setCedulaEmpleado(JOptionPane.showInputDialog(null, "Digite la cédula del empleado que agregó el producto:"));
          p.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de productos a ingresar:")));
          p.setPrecioBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el precio base del producto:")));
          p.setTipo(JOptionPane.showInputDialog(null, "Digite el tipo de producto (Alimentos, Bebidas, Higiene, Limpieza):"));
          inventario[x]=p;
      }
   }
   public void completar(){
      inventario[4]=new Producto("Refrescos",(float)20.00,1200.00);
      inventario[5]=new Producto("Snacks",(float)18.00,2600.00);
   }
   public void mostrar(){
      int x;
      String s="";
      for(x=0;x<inventario.length;x++){
          s=" "+
                  s+inventario[x].getDescripcion()+" "+inventario[x].getCantidad()+inventario[x].getPrecio()+"\n\n";
      }
      JOptionPane.showMessageDialog(null,"El arreglo contiene:\n"+s);
   }
}
//esta parte de abajo quedó incompleto porque no me dio tiempo 