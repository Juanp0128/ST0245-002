
public class Principal{

    public static void main(String args []){
        
        Valor giniresultante = CargarDatos.inicio("data\0_train_balanced_15000.csv", 15001);
        System.out.println(giniresultante.getVariablePadre()+" == "+giniresultante.getNombreValor()+" ig: "+giniresultante.getIndiceGini());
        
    }
}
