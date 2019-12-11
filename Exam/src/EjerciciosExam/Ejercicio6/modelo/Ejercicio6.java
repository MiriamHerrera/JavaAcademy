package modelo;

public class Ejercicio6 {

   private int  Id;
   private String State;
   private String Acronym;
    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the State
     */
    public String getState() {
        return State;
    }

    /**
     * @param State the State to set
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * @return the Acronym
     */
    public String getAcronym() {
        return Acronym;
    }

    /**
     * @param Acronym the Acronym to set
     */
    public void setAcronym(String Acronym) {
        this.Acronym = Acronym;
    }
    @Override
    public String toString(){
        return "Estado["; //falta aqui
    }
    
}
