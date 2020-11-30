/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generals;

/**
 *
 * @author Programador 1
 */
public class Contans {
 // query of system 
    public static String QUERY_ACABADO = "SELECT Id_Acabado, Descripcion FROM Acabados;";

    public static String QUERY_UNIDAD_MEDIDA = "SELECT Id_Unidad_Medida, Descripcion FROM Unidades_Medidas;";
    
    public static String QUERY_COMPONENTES = "SELECT Id_Componente,Codigo,Descripcion FROM arquitectdb.componentes;";
    
    public static String QUERY_CATEGORIAS = "SELECT Id_categoria,Descripcion,Tipo_Formula FROM arquitectdb.categorias;";
    
     public static String QUERY_SUBCOMPONENTES = "SELECT Id_subcomponente, Codigo, Descripcion FROM arquitectdb.subcomponentes;";
    

// static of system 
    public static String SELECTING = "-- Seleccionar --";
}
