import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter3Test {
    private Chapter3 character3=new Chapter3();

    @Test
    void convertDate(){
        character3.convertToDate("2021-01-01","12:00");
        character3.formateDateTime("2021-01-01","13:00");
        character3.instantExemple();
        character3.periodExemple();
    }
    @Test
    void allZonesId(){
        character3.allAvealeblZones();
    }
    @Test
    void flight(){
        character3.flight();
    }

}