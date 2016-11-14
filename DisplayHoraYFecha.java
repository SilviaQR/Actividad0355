
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{
   private NumberDisplay horas;
   private NumberDisplay minutos;
   private DisplayDosDigitos dia;
   private DisplayDosDigitos mes;
   private DisplayDosDigitos anio;
   
   public DisplayHoraYFecha()
   {
       horas = new NumberDisplay(24);
       minutos = new NumberDisplay(60);
       dia = new DisplayDosDigitos(31);
       mes = new DisplayDosDigitos(13);
       anio = new DisplayDosDigitos(100);
    }
    
     public void setMomento(int hora, int minuto, int dias, int meses, int anios)
   {
       horas.setValue(hora);
       minutos.setValue(minuto);
       dia.setValor(dias);
       mes.setValor(meses);
       anio.setValor(anios);
   }
    
   public void avanzarMomento()
   {
        minutos.increment();
        if (minutos.getValue() == 0){
            horas.increment();
            if(horas.getValue() == 0){
                dia.incrementaValor();
                if(dia.getValor() == 0) {
                    mes.incrementaValor();
                    if(mes.getValor() == 0){
                        anio.incrementaValor();
                    }
                }
            }
        }
    }
    
   public String getMomento()
   {
    return horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + dia.getValorDelDisplay() + "/" 
    + mes.getValorDelDisplay() + "/" + anio.getValorDelDisplay();
    }
}
   
   