/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Willian
 */
public class CalculoseTeor {
    
       

        double potassio; 
        double fosforo;
        double calcio; 
        double magnesio;
        double enxofre;

    public CalculoseTeor(double potassio, double fosforo, double calcio, double magnesio, double enxofre) {
        this.potassio = potassio;
        this.fosforo = fosforo;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
    }
        
        


      double CalcIdealFosforo (double solo ){

        
         double calc = (solo == 1) ? 9.0 : 12.0;

           return calc;

       } 


       double CalcIdealPotassio (double solo){

            double calc = (solo == 1) ? 0.35 : 0.25;

            return calc;
        
        }

        double CalcIdealCalcio (double solo){

        double calc = (solo == 1) ? 6.0 : 4.0 ;

           return calc;


        }

        double CalcIdealMagnesio (double solo){

              double calc = (solo == 1) ? 1.5 : 1.0 ;
     
                return calc;
     
     
             }


        double CalcIdealEnxofre (double solo){

             double calc = (solo == 1) ? 9.0 : 6.0 ;
     
              return calc;
     
     
             }
        
     





        }
    
    
    
    
