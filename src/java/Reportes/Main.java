/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import Modelo.Solicitud;
import ModeloDAO.SolicitudDAO;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Luis
 */
public class Main {
    public static void main(String args[]){
        // Fuente de Datos
        DefaultPieDataset data = new DefaultPieDataset();
        Solicitud sol=new Solicitud();
        SolicitudDAO dao=new SolicitudDAO();
        List<Solicitud>list=dao.listarGrafico();
                Iterator<Solicitud>iter=list.iterator();
                    while(iter.hasNext()){
                        sol=iter.next();    
                            int cantidad=sol.getId();
                            String fecha= sol.getCod()+"";
                            data.setValue(fecha, cantidad);
                    }
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Cantidad de solicitudes segun el año", 
         data, 
         true, 
         true, 
         false);
 
        // Mostrar Grafico
        ChartFrame frame = new ChartFrame("Solicitudes", chart);
        frame.pack();
        frame.setVisible(true);
    }
}
