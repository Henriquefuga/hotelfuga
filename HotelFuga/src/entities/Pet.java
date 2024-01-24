
package entities;

public class Pet {
    
    private String race;
    private String namePet;
    private String dateInput;
    private String dateOutput;
    private String allergic;

    /**
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return the namePet
     */
    public String getNamePet() {
        return namePet;
    }

    /**
     * @param namePet the namePet to set
     */
    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    /**
     * @return the dateInput
     */
    public String getDateInput() {
        return dateInput;
    }

    /**
     * @param dateInput the dateInput to set
     */
    public void setDateInput(String dateInput) {
        this.dateInput = dateInput;
    }

    /**
     * @return the dateOutput
     */
    public String getDateOutput() {
        return dateOutput;
    }

    /**
     * @param dateOutput the dateOutput to set
     */
    public void setDateOutput(String dateOutput) {
        this.dateOutput = dateOutput;
    }

    /**
     * @return the allergic
     */
    public String getAllergic() {
        return allergic;
    }

    /**
     * @param allergic the allergic to set
     */
    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }
}
