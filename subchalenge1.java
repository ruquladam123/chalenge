package showoff;



import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DKID
 */
public class subchalenge1 extends Chalenge1 {
    public void time(){
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy, HH:m:ss");
    }
    public void merk(){
    Scanner dam = new Scanner (System.in);
    Scanner roco = new Scanner (System.in);
    
        
        System.out.println("===============================================");
        System.out.println("==        -_KEROCO STORE & SPORT_-           ==");
        System.out.println("===============================================");
        System.out.println("==-------------------------------------------==");
        System.out.println("===============================================");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |     910     |    Adidas   |     Nike    | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |   Skechers  |     Puma    |   Reebook   | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |     Vans    |   Converse  |     Fila    | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("===============================================");
        System.out.println("  _____________________________ ");
        System.out.print(">>Pilih Merk Yang anda inginkan :");
        String merk = dam.nextLine();
        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println("=                _UKURAN_                     =");
        System.out.println("===============================================");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |     26      |      27     |      28     | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |      29     |      30     |      31     | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |      32     |      33     |      34     | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("===============================================");
        System.out.print(">>Pilih Ukuran Yang Anda Inginkan :");
        String ukuran = dam.nextLine();
        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println("=              _JENIS_              =");
        System.out.println("=====================================");
        System.out.println("= .---------------.---------------. =");
        System.out.println("= |   Laki-laki   |   Perempuan   | =");
        System.out.println("= .---------------.---------------. =");
        System.out.println("=====================================");
        System.out.print(">>Masukan Jenis Sepatu Anda :");
        String jenis = dam.nextLine();
        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println("=                 _WARNA_                     =");
        System.out.println("===============================================");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |    BLACK    |    WHITE    |    GOLD     | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |   SILVER    |    ORANGE   |   YELLOW    | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |    GREEN    |    BLUE     |     RED     | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("===============================================");
        System.out.print(">>Masukan warna yang anda inginkan :");
        String warna = dam.nextLine();
        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println("=                _KATEGORI_                   =");
        System.out.println("===============================================");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |  SANTAI    LARI    KANTORAN   OLAHRAGA  | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("===============================================");
        System.out.println(" ");
        System.out.print(">>Masukan Kategori Sepatu Yang Anda Inginkan :");
        String kategori = dam.nextLine();
        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println("=                 _HARGA_                     =");
        System.out.println("===============================================");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |   200000    |   300000    |   400000    | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |   500000    |   600000    |   700000    | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("= |  800000     |  900000     |   1000000   | =");
        System.out.println("= .-------------.-------------.-------------. =");
        System.out.println("===============================================");
        System.out.println(" ");
        System.out.print(">>Pilih Harga Yang Sesuai Dompet :");
        int harga = dam.nextInt();
        System.out.println(" ");
        System.out.print(">>Bayar duku gaynnn :");
        int bayar = dam.nextInt();
        int kembalian = bayar - harga ;
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("=========================================================");
        System.out.println("=========================================================");
        System.out.println("=|              PT.kerocolatte Indonesia               |=");
        System.out.println("=|      Jl.Doang Tapi Ga jadian ,mboh raroh , adoh.    |=");
        System.out.println("=|                  ig : kerocolatte.                  |=");
        System.out.println("=|                 Wa : 0859190974917                  |=");
        System.out.println("=|                     0044765133                      |=");
        subchalenge1 d = new subchalenge1();
        d.time();
        System.out.println("=========================================================");
        System.out.println("=|>>Merk sepatu :"+ merk+"                             ");
        System.out.println("=|>>Ukuran sepatu :"+ ukuran+"                         ");
        System.out.println("=|>>Jenis sepatu :"+ jenis+"                           ");
        System.out.println("=|>>Kategori sepatu :"+ kategori+"                     ");
        System.out.println("=|>>Warna sepatu :"+ warna+"                           ");
        System.out.println("=|>>Harga sepatu :"+ harga+"                           ");
        System.out.println("=|-----------------------------------------------------");
        System.out.println("=|>>Pembayaran :" + bayar + "                          ");
        System.out.println("=|>>Kembalian  :" + kembalian + "                      ");
        System.out.println("=========================================================");
        System.out.println("=| TERIMA KASIH TELAH BERKUNJUNG MESKI TIDAK MENETAP:D |=");
        System.out.println("=========================================================");
        
        
        System.out.println(">>Apakah anda ingin membeli sepatu lagi ?? ya/tidak");
        subchalenge1 y = new subchalenge1();
        String ulang = roco.nextLine();
        if (ulang.equals("ya")){
            y.diskon1();
        }

        else if (ulang.equals("tidak")){ 
             System.out.println("======================================================================================");
            System.out.println("=|TERIMA KASIH TELAH BERKUNJUNG MESKIPUN TIDAK MENETAP , WISH YOU HAPPY WITH HIM :))|=");
            System.out.println("======================================================================================");
         }
        System.out.println(">>Apakah anda ingin membeli sepatu lagi ?? ya/tidak");
        subchalenge1 x = new subchalenge1();
        String ulangg = roco.nextLine();
        if (ulangg .equals("ya")){
            x.diskon2();
        }
        else if (ulangg.equals("tidak")){
             System.out.println("======================================================================================");
            System.out.println("=|TERIMA KASIH TELAH BERKUNJUNG MESKIPUN TIDAK MENETAP , WISH YOU HAPPY WITH HIM :))|=");
            System.out.println("======================================================================================");
         
        }
        
        
}
}



    
      


        
    
   
    


