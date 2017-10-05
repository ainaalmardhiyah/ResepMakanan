package com.example.aina.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView gambarResep;
    TextView judulResep;
    TextView deskripsiResep;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gambarResep = (ImageView)findViewById(R.id.GambarResep);
        judulResep = (TextView)findViewById(R.id.JudulResep);
        deskripsiResep = (TextView)findViewById(R.id.DeskripsiResep);
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerResep);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);

        String[] judulResep = {"Cheese Cake Peach","Cheese Cake New York","Strawberry Triffle Cake","Cheese Cake Coklat","Cheese Cake Raspberry"};
        String[] deskripsiResep = {"Cheese cake dengan rasa buah peach asli dari luar negeri. Kali ini kami sajikan resep untuk membuat Cheese Cake Peach. Cheese cake yang simpel, dengan dasar sponge cake dan potongan buath peach segar pasti meleleh di lidah anda sejak pertama kali disantap. Anda dapat membuat sendiri kue sponge atau membeli sponge cake yang sudah dijual dalam kemasan.",
                "Cheese cake pertama kali diperkenalkan oleh penduduk Eropa dan dibawa ke Amerika Serikat pada akhir abad ke 19, yang kemudian dikenal dengan sebutan Cheese Cake New york. Cheese cake jenis ini adalah versi cheesecake yang murni, tidak menggunakan bahan tambahan pada isinya, maupun hiasan di atasnya.\n" +
                        "Meskipun tidak memakai topping mewah dan bahan campuran lainnya, tapi kelezatan Cheese cake New York ini tidak usah diragukan. Kali ini kami gunakan topping cocktail buah dan whipped cream untuk menambah kesegaran cheese cake. ","Trifle itu hidangan pencuci mulut (dessert) yang terkenal di Inggris. Dessert ini biasanya banyak disajikan pada moment menjelang natal dan tahun baru atau perayaan lainnya. Bahannya cukup mudah yaitu thick custard, sponge cake, buah-buahan segar, jelly atau Agar-Agar dan whip cream kocok. Trifle ini bisa divariasikan dgn bahan lainnya misal cokelat, Selai aneka buah dan bisa ditambah Wine."
                    ,"neka cheese cake yang kini banyak tersedia di café-café ataupun di toko kue, memang cocok sebagai hidangan saat menghabiskan waktu bersama teman-teman. Tapi jangan salah, anda bisa kok membuat sendiri dessert yang lezat dan menggoda ini. Proses membuat cheese cake tidaklah sulit, meski tetap memerlukan ketelitian dan kesabaran.\n" +
                "Cheese cake ada yang melalui proses pemanggangan (langsung dalam oven maupun proses tim/au bain marie), ada juga yang hanya didinginkan dalam freezer atau lemari es. Salah satu cheese cake yang didinginkan adalah yang akan kami sajikan resepnya di bawah ini, resep cheese cake coklat","Cheese cake digemari masyarakat karena mudah didapat, rasanya yang lezat, dan juga tidak sulit jika anda ingin membuat sendiri. Jenis cheese cake yang tidak dipanggang menggunakan gelatin sebagai bahan dasar pengeras adonan. Gelatin terbuat dari tulang hewan atau bahan nabati. Fungsinya sebagai zat pengental dan pengikat bahan-bahan makanan yang dipakai dalam pembuatan cake. Gelatin bisa berbentuk bubuk halus atau lembaran tipis bening.\n" +
                "Salah satu jenis cheese cake yang resepnya akan kami sajikan kali ini adalah Cheese cake Raspberry. Perpaduan buah raspberry yang kaya akan vitamin dan antioksidan dalam cheese cake akan mengurangi rasa bersalah anda saat menyantap dessert ini"};
        int[] gambarResep = {R.drawable.cheesecakepeach,R.drawable.cheesecakenewyork, R.drawable.strawberrytrifflecake,R.drawable.cheesecakecoklat,R.drawable.cheesecakeraspberry};

        String[] JudulDetail = {"Cheese Cake Peach","Cheese Cake New York","Strawberry Triffle Cake","Cheese Cake Coklat","Cheese Cake Raspberry"};
        String[] DeskripsiDetail = {"Bahan-bahan\n" +
                "Alas:\n" +
                "•\tSponge cake vanili ukuran 20x20 cm, belah 2 secara melintang, bentuk sesuai cetakan cutter\n" +
                "Cheese cake:\n" +
                "•\t125 ml air buah peach (kalengan)\n" +
                "•\t2 sdm air jeruk lemon\n" +
                "•\t3 sdm geltain bubuk\n" +
                "•\t375 g cream cheese\n" +
                "•\t80 g gula castor\n" +
                "•\t225 g peach kalengan, blender\n" +
                "•\t250 ml whip cream\n" +
                "Hiasan:\n" +
                "•\t50 g buah peach, potong-potong\n" +
                "•\t50 g anggur, belah 2\n" +
                "Cara membuat\n" +
                "1.\tSiapkan plastik mika sesuai bentuk cetakan cutternya, lapisi dasarnya dengan karton/alumunium foil\n" +
                "2.\tAlas: letakkan sponge cake vanili di dasar mika\n" +
                "3.\tCheese cake: tim gelatin bersama air buah peach dan air jeruk lemon hingga larut dna bening. Kocok cream cheese bersama gula hingga larut dan lembut. Masukkan blenderan peach, aduk hingga tercampur rata, tuangi larutan gelatin, aduk rata. Kocok whip cream hingga kental, masukkan sedikit demi sedikit ke dalam adonan cream cheese, aduk rata\n" +
                "4.\tTuang ke dalam cetakan mika yang sudah dialasi sponge cake, tutup dengan cling wrap, simpan dalam lemari es.\n" +
                "Simpan cheese cake selama 6-8 jam agar memadat dan tidak rapuh. Beri hiasan potongan peach dan anggur di atasnya, dinginkan lagi. Sajikan cheese cake selagi dingin agar tetap padat dan segar. Cheese cake Peach lezat disajikan untuk waktu anda bersantai bersama keluarga atau teman tercinta.",
                "Bahan-bahan\n" +
                        "Alas:\n" +
                        "•\t120 gr biskuit keju\n" +
                        "•\t75 g mentega tawar, lelehkan\n" +
                        "Cheese Cake:\n" +
                        "•\t375 g cream cheese\n" +
                        "•\t100 g sour cream\n" +
                        "•\t125 g gula castor\n" +
                        "•\t15 g tepung terigu\n" +
                        "•\t2 butir telur, kocok\n" +
                        "•\t1 kuing telur\n" +
                        "•\t2 sdt kulit jeruk lemon parut\n" +
                        "Topping:\n" +
                        "•\t100 ml whip cream, kocok hingga kental.\n" +
                        "•\tFruit cocktail, tiriskan.\n" +
                        "Didihkan bersama:\n" +
                        "•\t1 sdt jelly\n" +
                        "•\t1 sdm gula pasir\n" +
                        "•\t100 ml air\n" +
                        "Cara membuat\n" +
                        "1.\tSiapkan oven dengan suhu 170 oC. siapkan loyang spring form diameter18 cm\n" +
                        "2.\tAlas: campur biskuit dengan mentega, aduk rata. Letakkan di dasar loyang, tekan-tekan agar memadat. Simpan di lemari es.\n" +
                        "3.\tCheese cake: kocok cream cheese dengan gula hingga gula larut, masukkan terigu, kocok tara, masukkan sedikit demi sedikit kocokan telur dan kuning telur sambil terus dikocok rata. Masukkan parutan kulit jeruk lemon, sour cream, kocok rata. Tuang adonan cheese cake ke dalam cetakan yang sudah diberi alas adonan biskuit.\n" +
                        "4.\tPanggang dengan cara Au Bain Marie selama 60 menit hingga adonan matang. Matikan oven, keluarkan loyang, biarkan cheese cake dingin dalam oven keluar yang terbuka. Tutup dengan cling wrap, simpan dalam lemari es.\n" +
                        "5.\tHiasi bagian atas cheesecake dengan whipped cream dan fruit cocktail. Lapisi buah dengan adonan jeli. Potong sesuai selera.\n","Bahan-bahan:\n" +
                "•\t15 buah strawberry\n" +
                "•\t2 sdm gula pasir\n" +
                "•\t2 lembar roti tawar, potong dadu \n" +
                "•\t1 bungkus puding susu instan\n" +
                "•\t1 bungkus vla instan\n" +
                "•\twhipped cream\n" +
                "Cara membuat:\n" +
                "1.\tIris tipis buah strawberry dan aduk rata dengan gula pasir. Biarkan hingga agak layu.\n" +
                "2.\tBuat puding susu dengan air secukupnya. Biarkan dingin dan masukkan ke kulkas agar padat. Buat vla instan, simpan juga ke kulkas. \n" +
                "3.\tTata strawberry, roti tawar, puding dan vla bergantian hingga tampak seperti berlapis-lapis. Terakhir, tutup bagian permukaannya dengan whipped cream.\n","Bahan-bahan\n" +
                "Alas:\n" +
                "•\t375 g biskuit jahe, hancurkan\n" +
                "•\t75 g mentega tawar, lelehkan\n" +
                "Cheese cake:\n" +
                "•\t200 ml susu cair\n" +
                "•\t50 g gula pasir\n" +
                "•\t¼ sdt garam\n" +
                "•\t25 g coklat bubuk\n" +
                "•\t20 g maizena, larutkan dengan 2 sdm air\n" +
                "•\t2 kuning telur, kocok\n" +
                "•\t250 g dark cooking chocolaate, lelehkan\n" +
                "•\t3 sdm gelatin bubuk, tim dengan 50 ml air hingga larut dan bening\n" +
                "•\t250 g cream cheese\n" +
                "•\t300 g double cream/krim kental, kocok setengah mengembang\n" +
                "Topping:\n" +
                "•\t100 ml double cream/krim kental\n" +
                "•\t150 g dark cooking chocolate, potong-potong atau serut\n" +
                "Cara membuat\n" +
                "1.\tSiapkan plastik mika sesuai bentuk cetakan cutternya, lapisi dasrnya dengan karton/alumunium foil\n" +
                "2.\tAlas: aduk rata biskuit bersama mentega, letakkan di dasar cetakan mika, simpan dalam lemari es.\n" +
                "3.\tCheese cake: didihkan susu cair bersama gula, garam dan coklat bubuk sambil diaduk. Masukkan larutan maizena, aduk, masak hingga adonan meletup-letup. Masukkan kuning telur, aduk rata, masukkan dark cooking chocolate, aduk hingga larut, tambahkan larutan gelatin, aduk.\n" +
                "4.\tKocok cream cheese, masukkan adonan susu sedikit demi sedikit sambil terus dikocok perlahan. Masukkan adonan ke dalam kocokan krim sedikit demi sedikit sambil terus dikocok perlahan hingga tercampur rata. Tuang adonan cheese cake di atas alas biskuit, tutup dengan cling wrap, simpan dalam lemari es.\n" +
                "5.\tTopping: panaskan krim kental, masukkan potongan dark cooking chocolate, aduk hingga larut, tuang di atas cheese cake, dinginkan lagi.\n","Bahan-bahan\n" +
                "Alas:\n" +
                "•\tSponge cake coklat ukuran 20/20 cm, belah 2 secara melintang, bentuk sesuai cetakan cutter\n" +
                "Cheese cake:\n" +
                "•\t200 g cream cheese\n" +
                "•\t100 g white cooking chocolate, lelehkan\n" +
                "•\t3 sdm gelatin, tim dengan 50 ml air hingga larut\n" +
                "•\t100 g whip cream\n" +
                "•\t100 g raspberry, potong-potong\n" +
                "Cara membuat\n" +
                "1.\tSiapkan plastik mika sesuai bentuk cetakan cutternya, lapisi dasarnya dengan karton/alumunium foil\n" +
                "2.\tAlas: letakkan sponge cake coklat di dasar mika\n" +
                "3.\tCheese cake: kocok cream cheese hingga lembut, masukkan white cooking chocolate, kocok hingga tercampur rata. Masukkan larutan gelatin dan whip cream, aduk rata.\n" +
                "4.\tTambahkan potongan raspberry, aduk rata. Tuang adonan ke dalam mika yang sudah berisi sponge cake tutup dengan cling wrap, simpan dalam lemari es.\n"};

        int[] GambarDetail = {R.drawable.cheesecakepeach,R.drawable.cheesecakenewyork,R.drawable.strawberrytrifflecake,R.drawable.cheesecakecoklat,R.drawable.cheesecakeraspberry};

        ArrayList<ListResep>listresep = new ArrayList<>();

        for (int i = 0; i<judulResep.length;i++)
        {
            ListResep listResep = new ListResep(judulResep[i],gambarResep[i],deskripsiResep[i],GambarDetail[i],DeskripsiDetail[i],JudulDetail[i]);
            listresep.add(listResep);
        }
        ListResepAdapter listResepAdapter = new ListResepAdapter(this,listresep);
        recyclerView.setAdapter(listResepAdapter);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
