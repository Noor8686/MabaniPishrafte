import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class MachinTest {

    @Test
    void Mashin_Bayad_Herekat_Konad_Waghte_Dar_Baste_Ast_va_Mashin_Roshan_Ast() {
        // Given
        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("Vovo");

        // When
        boolean ayaharekatMekonad = benz.ayaMachinDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMekonad = volvo.ayaMachinDarHaleHarekatAst();

        // Then
        assertFalse(ayaharekatMekonad);
        assertTrue(ayaVolvoHarekatMekonad);





        // Object
//        Mashin mashin = new Mashin();
//        mashin.bazkardaneDar();
//        mashin.bastanDar();
//
//        System.out.println("Dar Mashin baz Ast?" + mashin.ayaDarMachinBazAst);
//        mashin.harekat();
//        System.out.println("-----------------------------------------------");
//        Mashin pride = new Mashin("pride");
//        pride.roshan();
//        pride.bazkardaneDar();
//        pride.harekat();
    }

    class Mashin {

        // Dade
        boolean ayaMachinRoshanAst;
        boolean ayaDarMachinBazAst;
        String mark;

        // Constructor
        Mashin() {
            out.println("Yak Mashin bedone Dade Sachte Shod");
        }

        Mashin(String mark){
            this.mark = mark;
            out.println("Yek Mashine " + this.mark + " sachte shod");
        }

        // Tabe (Method)
        void roshan(){
            out.println("Masin Roshan Ast");
            ayaMachinRoshanAst = true;
        }

        void khamosh(){
            out.println("Masin Khamoush Ast");
            ayaMachinRoshanAst = false;
        }

        void bazkardaneDar(){
            out.println("Dar Baz Ast");
            ayaDarMachinBazAst = true;
        }

        void bastanDar(){
            out.println("Dar Baste shod");
            ayaDarMachinBazAst = false;
        }

            boolean ayaMachinDarHaleHarekatAst(){
            // Dar baste bashe va machin roshan bashad(rule)
            if (!ayaDarMachinBazAst && ayaMachinRoshanAst){
                out.println("Mashin dar Hale Haraket Ast");
                return true;
            } else {
                out.println("Mashin Park ASt");
                return false;
            }
        }
    }
}
