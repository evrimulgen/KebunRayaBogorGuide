package com.krbguide.kebunrayabogorguide;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseFeatured extends SQLiteOpenHelper {

    final static String DB_NAME = "detail_featured";

    public DatabaseFeatured(Context mContext) {

        super(mContext, DB_NAME, null, 1);

    }

    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE IF NOT EXISTS detail_featured(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "db_name TEXT, db_subname TEXT, db_description TEXT, db_coordinate TEXT, db_img BLOB, db_ico BLOB)";
        db.execSQL(sql);
        ContentValues mValues = new ContentValues();

        mValues.put("_id", "1");
        mValues.put("db_img", R.drawable.header_detail_tamanlebaksudjana);
        mValues.put("db_ico", R.drawable.ic_featured_tamanlebaksudjana);
        mValues.put("db_name", "Taman Lebak Sudjana");
        mValues.put("db_subname", "Lebak Sudjana Park");
        mValues.put("db_description", "Taman Lebak Sudjana Kassan atau yang disebut dengan Taman Bhineka merupakan taman yang sangat unik. Tepat di depan relief nya, ada sekitar 8 anak tangga dan jalanan yang lebih tinggi letak nya dari taman tersebut.\nDilihat dari atas ketinggian, tanaman-tanaman yang ditata dalam satu relief besar tersebut berbentuk burung garuda. Bentuk nya terlihat jelas, dari kedua sayap, kepala hingga kaki burung garuda. Karena relief nya seperti burung garuda maka disebutlah taman bhineka.\nDi depan burung garuda tersebut terdapat suatu patung berbentuk setengah badan manusia. Di patungnya terdapat nama Lebak Sudjana Kassan, Bogor, 18 Mei 1985. Sudjana Kassan adalah orang Indonesia pertama yang menjadi pimpinan Kebun Raya Bogor setelah menggantikan J.Douglas.");
        mValues.put("db_coordinate", "-6.5929, 106.80115");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "2");
        mValues.put("db_img", R.drawable.header_detail_makamkramat);
        mValues.put("db_ico", R.drawable.ic_featured_makamkramat);
        mValues.put("db_name", "Makam Kramat");
        mValues.put("db_subname", "Shrine");
        mValues.put("db_description", "Ada 3 makam dan makam ini dipercaya sebagai tempat peristirahatan terakhir dari Ibu Ratu Galuh Mangku. Dia adalah istri dari Sri Baduga Prabu Siliwangi, Raja Kerajaan Padjajaran. Makam kramat yang kedua adalah makam Mbah Djapra. Sementara yang ketiga adalah makam Mbah Ba’ul yang merupakan patih dari Sri Baduga Prabu Siliwangi. Ketiga makam tersebut mempunyai 1 juru kunci dan 2 orang perawat makam.\nKetiga makam berbentuk kompleks pemakaman kecil yang dilindungi pagar besi. Meski berada disekitar Kebun Raya, makam ini bukan bagian dari Kebun Raya dan pemeliharaan nya sendiri diluar tanggung jawab Kebun Raya. Kompleks makam terletak di bagian bawah kerimbunan pohon-pohon besar. Sehingga di areal makam ini tetap terasa sejuk. Makam terbesar adalah makam Ratu Galuh, yang letak nya paling dekat dengan pintu pagar besi dan dilengkapi dengan peralatan tempat para peziarah berdoa. Makam Mbah Djapra berada disebelahnya tetapi berada di bagian lahan lebih tinggi. Sementara disebelah kanan makam Mbah Djapra dan makam Ratu Galuh adalah makam Mbah Ba’ul.\nKetiga makam tersebut tidak mempunyai nama lengkap yang jelas di sebuah nisan, namun kini makam tersebut berlapis lantai keramik yang mempunyai perbedaan masing-masing. Patung semen warna emas berbentuk mahkota menghiasi makam Ratu Galuh, sementara makam Mbah Jeprah mempunyai hiasan yang berbentuk prisai dan ujung tombak. Mbah Ba’ul pun dihias dengan patung semen berupa cangkul dan nasi tumpeng. Dari semua hiasan tersebut sebenarnya tidak mempunyai makna apapun hanya sebagai pembeda antara ketiga makam, namun makna-makna itu bisa diambil dari setiap orang yang menilainya. Tentu saja setiap orang akan memaknai dengan makna yang berbeda karena mempunyai penilaian masing-masing.");
        mValues.put("db_coordinate", "-6.59583, 106.79979");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "3");
        mValues.put("db_img", R.drawable.header_detail_kolamgunting);
        mValues.put("db_ico", R.drawable.ic_featured_kolamgunting);
        mValues.put("db_name", "Kolam Gunting");
        mValues.put("db_subname", "Gunting Lake");
        mValues.put("db_description", "Kolam Gunting yang terbentang dengan bunga teratai yang bermekaran di kolam. Sebuah pulau kecil yang dipenuhi tumbuhan dan suara burung kowak (Nycticorax nycticorak) menjadi bagian dari kolam. Pulau kecil ini merupakan tempat penginapan bagi beberapa jenis burung, tercatat lebih dari 50 jenis burung yang ada di Kebun Raya Bogor, seperti kepodang, kutilang, prenjak, walik kembang, kucica, kowak, kuntul, dan cinenen kelabu. Jika datang pagi hari atau saat pengunjung datang masih sedikit, kicauan burung-burung ini sangat meriah. Sedangkan sore harinya pengunjung bisa melihat kuntul berseliweran pulang ke peraduannya di atas kolam.");
        mValues.put("db_coordinate", "-6.60039, 106.79809");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "4");
        mValues.put("db_img", R.drawable.header_detail_jembatansuryalembayung);
        mValues.put("db_ico", R.drawable.ic_featured_jembatansuryalembayung);
        mValues.put("db_name", "Jembatan Surya Lembayung");
        mValues.put("db_subname", "Surya Lembayung Bride");
        mValues.put("db_description", "Jembatan ini mulai pertama diresmikan pada 25 Mei 2001.");
        mValues.put("db_coordinate", "-6.59363, 106.80032");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "5");
        mValues.put("db_img", R.drawable.header_detail_tuguladyraffles);
        mValues.put("db_ico", R.drawable.ic_featured_tuguladyraffles);
        mValues.put("db_name", "Tugu Lady Raffles");
        mValues.put("db_subname", "Lady Raffles Monument");
        mValues.put("db_description", "Bangunan unik bernilai sejarah ini didirikan Sir Thomas Stamford Raffles, seorang letnan gubernur inggris di Pulau Jawa (1811 – 1816), sebagai kenangan kepada isterinya. Olivia Mariamme Raffles yang meninggal pada tahun 1814, pada usia 43 tahun, karena sakit malaria. Sebagai isteri Gubernur, Olivia Mariamme memperkenalkan reformasi sosial di kalangan kawasan Jawa. Sebait kata-kata puitis dalam bahasa inggris klasik yang ditemukan di tugu ini adalah tulisan Olivia Mariamme sendiri.");
        mValues.put("db_coordinate", "-6.60201, 106.79833");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "6");
        mValues.put("db_img", R.drawable.header_detail_makambelanda);
        mValues.put("db_ico", R.drawable.ic_featured_makambelanda);
        mValues.put("db_name", "Makam Belanda");
        mValues.put("db_subname", "Belanda's Graveyard");
        mValues.put("db_description", "Komplek pemakaman tua ini telah ada jauh sebelum Kebun Raya Bogor didirikan tahun 1817 oleh C.G.C Reindwart. Bentuk  nisan, ornament dan tulisan nya sangat unik.\nDisini terdapat 42 makam, 38 diantaranya terdapat identitas dan sisanya tak dikenal. Kebanyakan yang dimakamkan disini adalah keluarga dekat Gubernur Jendral Hindia Belanda. Ada makam D.J Eeren, seorang gubernur jendral yang menjabat pada tahun 1836-1840. Juga makam Mr. Ary Prins seorang ahli hokum yang pernah dua kali menjadi pejabat sementara gubernur jendral Hindia Belanda.\nAda pula dua orang ahli biologi yang meninggal tahun 1870an dalam usia muda dan dikuburkan dalam satu makam. Mereka adalah Hainrich Kuhl dan J.C Van Hasselt, anggota “The Netherlands Commission for Natural Science” yang dikirim ke Indonesia untuk bekerja di Kebun Raya Bogor.\nMakam tertua di komplek pemakaman ini adalah makam seorang administrator took obat berkebangsaan Belanda yang bernama Cornelis Potmans, wafat 2 Mei 1784. Sedangkan yang paling baru adalah makam Prof. Dr. A.J.G.H. Kostermans yang meninggal pada tahun 1994. Ia adalah seorang ahli botani terkenal dari Belanda yang menjadi warga Negara Indonesia sejak tahun 1958. Konstermans dimakamkan dekat lingkungan tumbuhan yang ia cintai sesuai keinginannya, selain sebagai penghargaan pemerintah Indonesia atas jasa-jasa nya untuk ilmu pengetahuan. Hingga akhir hayat nya ia bekerja di kantor Herbarium Bogoriense yang terletak diseberang Kebun Raya Bogor.");
        mValues.put("db_coordinate", "-6.59943, 106.79627");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "7");
        mValues.put("db_img", R.drawable.header_detail_tamanteisjmann);
        mValues.put("db_ico", R.drawable.ic_featured_tamanteisjmann);
        mValues.put("db_name", "Taman Teisjmann");
        mValues.put("db_subname", "Teisjmann Park");
        mValues.put("db_description", "Taman ini dibangun pada 1884 oleh Dr. Melchior Treub sebagai bentuk penghargaan kepada Johannes Elias Teijsmann atas jasa-jasanya dalam mengembangkan dan merelokasikan koleksi tanaman di Kebun Raya Ini yang kemudian dikelompokkan berdasarkan suku. Teijsmann memegang jabatan kurator s’land Plantetuin (sekarang kebun raya bogor) dari tahun 1831 – 1869. Teijsmann melakukan pengembangan koleksi kebun bersama sang asisten, Justus Karl Hasskarl, seorang ahli botani.\nTaman ini dibuat dengan mengikuti pol ataman formal berupa kumpulan tanaman yang ditata secara simetris seperti taman di Negara-negara Eropa. Di sini, anda akan menemukan sebuah tugu peringatan bagi Teijsmann, terbuat dari batu granit yang khusus didatangkan dari Berlin, Jerman.");
        mValues.put("db_coordinate", "-6.60123, 106.79532");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "8");
        mValues.put("db_img", R.drawable.header_detail_tamankoleksitumbuhanair);
        mValues.put("db_ico", R.drawable.ic_featured_tamankoleksitumbuhanair);
        mValues.put("db_name", "Taman Koleksi Tumbuhan Air");
        mValues.put("db_subname", "Garden of Water Plants Collection");
        mValues.put("db_description", "Tumbuhan air adalah tumbuhan yang sebagian besar maupun semua bagian hidupnya didalam air atau tumbuhan yang memiliki siklus hidup di air atau sekitar air. Taman koleksi tumbuhan air memiliki luas 10.000 m2 dengan jumlah koleksi lebih dari 95 jenis. Koleksi tumbuhan air di taman ini dikelompokan berdasarkan cara hidupnya yaitu : biok tumbuhan air tergenang, terapung, tengelam, campuran dan tumbuhan tepi air. Anda akan menemukan contoh cara hidup tumbuhan air di 5 buah kolam yang berada di taman ini.");
        mValues.put("db_coordinate", "-6.6009, 106.80091");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "9");
        mValues.put("db_img", R.drawable.header_detail_tamankoleksitumbuhanobat);
        mValues.put("db_ico", R.drawable.ic_featured_tamankoleksitumbuhanobat);
        mValues.put("db_name", "Taman Koleksi Tanaman Obat");
        mValues.put("db_subname", "Garden of Medical Plants Collection");
        mValues.put("db_description", "Masyarakat Indonesia dengan kearifan lokalnya, sejak zaman dahulu telah menggunakan tumbuh-tumbuhan sebagai bahan obat alami. Untuk menjaga kelestarian tumbuhan obat tersebut, kebun raya bogor melakukan konservasi tumbuhan obat sebagai bagian dari koleksinya yang dikumpulkan dari berbagai daerah yang berada di Indonesia dan belahan dunia lain. Koleksi tumbuhan obat Kebun Raya Bogor disatukan dengan taman tematik yang memiliki 9 kelompok berdasarkan kegunaan");
        mValues.put("db_coordinate", "-6.59344, 106.80174");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "10");
        mValues.put("db_img", R.drawable.header_detail_jembatanmerah);
        mValues.put("db_ico", R.drawable.ic_featured_jembatanmerah);
        mValues.put("db_name", "Jembatan Merah (Gantung)");
        mValues.put("db_subname", "The Red Bridge");
        mValues.put("db_description", "Pada tahun 1881 seorang arsitek Belanda, Mr Motmann, bersama amtenar pribumi bernama Saripin membangun jembatan melintasi Sungai Cipakancilan. Setelah rampung, jembatan lengkap dengan lampu-lampu gas tersebut dilumuri cat warna merah bata, dari sinilah sebutan Jembatan Merah Gantung diambil.\nTahun 1945 di masa perjuangan kemerdekaan, jembatan ini dipenuhi mayat-mayat pejuang. Tahun 1966 Pahlawan asal Surabaya, Bung Tomo, melintasi Jembatan Merah dan melambaikan tangan ke penduduk setempat. Sekarang Kawasan ini menjadi perlintasan padat sejak berdiri Plaza Jembatan Merah di sisi Jalan Veteran.\nSaat Peringatan Proklamasi warga setempat melakukan pengecatan Jembatan Merah, dengan warna aslinya merah bata Selain itu mengecat pita beton dengan warna hitam putih. Karena jembatan ini melintas di atas sungai Cipakancilan disebut Jembatan Merah karena sejak dibangunnya dicat dengan warna merah (merah bata).\nSuatu kenangan yang yang tak dapat dilupakan, ketika mayat pahlawan menetes di jembatan tersebut dan menjadi suatu peristiwa tragis yang dialami ketika jaman perjuangan dulu sehingga sesuai pula bila jembatan ini selamanya di cat dengan warna Merah Darah.\nJembatan Gantung ini merupakan serupa dengan golden gate yang terletak di san Fransisco. Jembatan merah ini memang indah. Seorang teman berpendapat bahwa jembatan ini indah digunakan sebagai lokasi pemotretan pre wedding. Hmm..entahlah, indah memang, namun banyak mitos berkembang bahwa jika ke jembatan gantung bersama kekasih, hubungan perkekasihan tidak akan bertahan lama, alias putus setelah berkasih-kasihan di jembatan gantung. Seperti lagu yang pas, “jangan kau gantung cerita cintaku…” Jika digunakan sebagai lokasi pre wedding apakah pasangan tersebut akan bercerai?");
        mValues.put("db_coordinate", "-6.59621, 106.80087");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "11");
        mValues.put("db_img", R.drawable.header_detail_kolamteratairaksasa);
        mValues.put("db_ico", R.drawable.ic_featured_kolamteratairaksasa);
        mValues.put("db_name", "Kolam Teratai Raksasa");
        mValues.put("db_subname", "Giant Lotus Pond");
        mValues.put("db_description", "Kolam ini terdapat di depan café dedaunan dan memiliki sebuah teratai yang sangat besar dan indah sehingga pengunjung yang berada di dalam café maupun dipinggir kolam dapat menikmati indahnya kolam teratai ini. ");
        mValues.put("db_coordinate", "-6.59916, 106.80275");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "12");
        mValues.put("db_img", R.drawable.header_detail_gardenshop);
        mValues.put("db_ico", R.drawable.ic_featured_gardenshop);
        mValues.put("db_name", "Garden Shop");
        mValues.put("db_subname", "Garden Shop");
        mValues.put("db_description", "Pada tempat ini terdapat berbagai jenis souvenir-souvenir tanaman yang berada di Kebun Raya Bogor.");
        mValues.put("db_coordinate", "-6.60196, 106.79791");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "13");
        mValues.put("db_img", R.drawable.header_detail_museumzoologi);
        mValues.put("db_ico", R.drawable.ic_featured_museumzoologi);
        mValues.put("db_name", "Museum Zoologi");
        mValues.put("db_subname", "Zoology's Museum");
        mValues.put("db_description", "Museum Zoologi Bogor adalah museum yang terletak di Bogor, memiliki koleksi yang berkaitan dengan dunia satwa seperti berbagai spesimen yang diawetkan maupun fosil hewan. Museum ini terbagi menjadi dua, salah satunya dibuka setiap hari untuk umum yang berisi ruang pameran terletak di Jalan Ir. H. Juanda No. 9 Bogor, museum yang satu lagi berfungsi sebagai tempat koleksi dan hanya dibuka untuk umum setahun sekali pada bulan Oktober, berada di Pusat Ilmu Pengetahuan Cibinong tepatnya di Jalan Raya Jakarta - Bogor Km.46 Cibinong, Bogor. Kedua bagian museum ini dikelola oleh Bidang Zoologi Pusat Penelitian Biologi-LIPI. Awal berdirinya Museum Zoologi Bogor merupakan laboratorium zoologi dengan nama Landbouw Zoologisch Laboratorium yang didirikan pada tahun 1894 gagasan dari J. C. Koningsberger ahli botani berkebangsaan Jerman, laboratorium ini didirikan sebagai sarana penelitian yang berkaitan dengan pertanian dan zoologi. Pada tahun 1906 namanya berubah menjadi Zoologisch Museum and Wekplaats, pada tahun 1910 kemudian berubah lagi menjadi Zoologisch Museum en Laboratorium. Antara tahun 1945-1947 tempat ini dikenal dengan nama Museum Zoologicum Bogoriense, dan akhirnya sampai sekarang menjadi Museum Zoologi Bogor. Tempat koleksi museum ini memiliki 24 ruangan koleksi dan baru ditempati pada 1997, dengan pembangunan yang didanai dari dana hibah Bank Dunia dan Jepang. Koleksi ilmiah yang dimiliki museum ini meliputi kategori antara lain: mamalia, ikan, burung, reptil dan amphibi, moluska, serangga, dan invertebrata lain yang bukan moluska dan serangga.");
        mValues.put("db_coordinate", "-6.60340,106.7970");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "14");
        mValues.put("db_img", R.drawable.header_detail_areakelapasawit);
        mValues.put("db_ico", R.drawable.ic_featured_areakelapasawit);
        mValues.put("db_name", "Area Kelapa Sawit");
        mValues.put("db_subname", "Oil Palm Area");
        mValues.put("db_description", "Kelapa sawit didatangkan ke Indonesia oleh pemerintah Hindia Belanda pada tahun 1848. Beberapa bijinya ditanam di Kebun Raya Bogor, sementara sisa benihnya ditanam di tepi-tepi jalan sebagai tanaman hias di Deli, Sumatera Utara pada tahun 1870-an.\nPada saat yang bersamaan meningkatlah permintaan minyak nabati akibat Revolusi Industri pertengahan abad XIX. Dari sini kemudian muncul ide membuat perkebunan kelapa sawit berdasarkan tumbuhan seleksi dari Bogor dan Deli, maka dikenallah jenis sawit Deli Dura.\nTahun 1911, kelapa sawit mulai diusahakan dan dibudidayakan secara komersial dengan perintisnya di Hindia Belanda adalah Adrien Hallet, seorang Belgia, yang lalu diikuti oleh K. Schadt. Perkebunan kelapa sawit pertama berlokasi di Pantai Timur Sumatera (Deli) dan Aceh.\nLuas areal perkebunan mencapai 5.123 ha. Pusat pemuliaan dan penangkaran kemudian didirikan di Marihat (terkenal sebagai AVROS), Sumatera Utara dan di Rantau Panjang, Kuala Selangor, Malaya pada 1911-1912. Di Malaya, perkebunan pertama dibuka pada tahun 1917 di Ladang Tenmaran, Kuala Selangor menggunakan benih dura Deli dari Rantau Panjang. Di Afrika Barat sendiri penanaman kelapa sawit besar-besaran baru dimulai tahun 1911.\nHingga menjelang pendudukan Jepang, Hindia Belanda merupakan pemasok utama minyak sawit dunia. Semenjak pendudukan Jepang, produksi merosot hingga tinggal seperlima dari angka tahun 1940.\nUsaha peningkatan pada masa Republik dilakukan dengan program Bumil (buruh-militer) yang tidak berhasil meningkatkan hasil, dan pemasok utama kemudian diambil alih Malaya (lalu Malaysia).\nBaru semenjak era Orde Baru perluasan areal penanaman digalakkan, dipadukan dengan Sistem PIR perkebunan. Perluasan areal perkebunan kelapa sawit terus berlanjut akibat meningkatnya harga minyak bumi, sehingga peran minyak nabati meningkat sebagai energi alternatif.");
        mValues.put("db_coordinate", "-6.59943,  106.80045");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "15");
        mValues.put("db_img", R.drawable.header_detail_tamanmexico);
        mValues.put("db_ico", R.drawable.ic_featured_tamanmexico);
        mValues.put("db_name", "Taman Mexico");
        mValues.put("db_subname", "Mexico's Park");
        mValues.put("db_description", "Di kawasan ini terdapat tumbuhan asal gurun Amerika dan Asia. Di sini ada 100 jenis kaktus, agave, yucca, dan sukulen yang berbeda bentuk dan warna batang, bunga, dan ukuran duri.\nMisalnya, agave karibia atau si pedang berduri. Bentuk daun seperti pedang yang pada bagian mata atau ujung adalah duri. Ada juga Agave latifolia Karw yang berdaun merah-nila, Agave vivipara L yang di kedua sisi daun penuh duri, Agave americana L var striata yang berdaun hijau, tetapi kedua tepinya kuning, dan Agave potatorum Zucc.\nAda kaktus Cereus repandus (L) mill yang sisi batang berduri dan dalam berongga bahkan bisa menggelembung saat berisi air untuk hidup bulanan bahkan tahunan.\nSemua tumbuhan gurun itu ditata pada lahan yang diberi kerikil dan karang putih, krem, marun, dan hitam. Penataan itu membuat Taman Meksiko bernuansa gurun sehingga paling berbeda di antara lokasi lain dalam kawasan seluas total 87 hektar dan bernama resmi Pusat Konservasi Tumbuhan Kebun Raya Lembaga Ilmu Pengetahuan Indonesia itu.\nTaman Meksiko berada di sisi selatan. Areal ini berbatasan dengan dinding pagar di sisi Jalan Otto Iskandar Dinata atau biasa disingkat Otista. Untuk itu, Taman Meksiko paling mudah dicapai dari gerbang utama di depan Simpang Suryakancana yang merupakan pertemuan tiga ruas jalan, yakni Otista, Juanda, dan Suryakancana.");
        mValues.put("db_coordinate", "-6.60223,106.80063");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "16");
        mValues.put("db_img", R.drawable.header_detail_rumahanggrek);
        mValues.put("db_ico", R.drawable.ic_featured_rumahanggrek);
        mValues.put("db_name", "Rumah Anggrek");
        mValues.put("db_subname", "Orchid's House");
        mValues.put("db_description", "Di Rumah Anggrek terdapat dua rumah kaca yang berukuran cukup besar, satu diantaranya berisi koleksi anggrek hibrida, dan satunya lagi berisi koleksi anggrek alam. Koleksi Rumah Anggrek berjumlah lebih dari 500 jenis, yang berasal dari tempat-tempat di ujung barat sampai ujung timur Indonesia. Di sana juga ada beberapa lahan yang dikhususkan untuk mempelajari dan mengembangkan tanaman anggrek.");
        mValues.put("db_coordinate", "-6.59531, 106.8036");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "17");
        mValues.put("db_img", R.drawable.header_detail_labtreub);
        mValues.put("db_ico", R.drawable.ic_featured_labtreub);
        mValues.put("db_name", "Laboratorium Treub");
        mValues.put("db_subname", "Treub Laboratory");
        mValues.put("db_description", "Laboratorium Treub dibangun pada tahun 1894 atas prakarsa Prof. Dr. Melchior Treub. Laboratorium ini merupakan cikal bakal berdirinya Laboratorium Fitokimia, Bidang Botani, Pusat Penelitian (Puslit) Biologi LIPI yang pada awal tahun 2007, Laboratorium Fitokimia dipindahkan ke gedung baru yang berada di kawasan Cibinong Science Center.\nMelchior Treub adalah seorang ahli botani berkebangsaan Belanda. Ia lahir di Voorchoten, Belanda pada tanggal 26 Desember 1851, dan meninggal di Saint-Raphaël, Perancis pada tanggal 3 Oktober 1910 pada umur 58 tahun akibat penyakit malaria yang dideritanya selang setahun kepulangannya dari Hindia Belanda.\nTreub lulus dari program doktoralnya di Universitas Leiden pada tahun 1873. Dua dosen yang berperan penting bagi keilmuannya Treub kala di Universitas Leiden adalah W.F.R. Suringar, seorang ahli botani, dan E. Selenka, seorang ahli zoologi.\nSetelah itu, ia tertarik untuk menerima tawaran untuk melakukan penelitian botani di Hindia Belanda yang terkenal sebagai daerah tropis. Ia melakukan penelitian sekaligus inventarisasi jenis flora yang ada di daerah tropis. Pada tahun 1880, Treub ditunjuk sebagai Direktur S’ Lands Plantentuin (Botanical Garden) di Bogor, atau yang sekarang dikenal dengan Kebun Raya Bogor.\nKemampuannya mengelola lembaga ini luar biasa, sehingga di bawah asuhan dan pengarahannya, Kebun Raya Bogor menjadi suatu pusat penelitian yang terkenal di seluruh dunia dan Bogor kala itu menjadi kiblat bagi para biologiwan dunia. Ia mendirikan laboratorium penelitian yang terbuka bagi peneliti asing, sehingga berhasil memikat ratusan peneliti untuk datang dan meneliti peri kehidupan alam hayati tropika di Bogor. Laboratorium ini kemudian dikenal dengan nama Laboratorium Treub. Ia juga menjadikan Herbarium Bogoriense sebagai lembaga tersendiri.\nSelain itu, ia juga termasuk salah seorang yang membantu membidani bagi Museum Zoologi Bogor, mendirikan sebuah lembaga penelitian laut di Jakarta, serta laboratorium untuk meneliti sifat-sifat kimiawi tetumbuhan tropis. Karena menyadari betapa besar peranan sumber daya alam hayati dalam perekonomian Hindia Belanda (kini Indonesia), ia mengusulkan agar penanganan pengembangannya dilakukan secara penuh oleh suatu departemen khusus yang berdiri sendiri. Karena itu, pada tahun 1905 Treub diberi kepercayaan untuk memimpin departemen baru, yang kemudian akan menjadi cikal bakal Departemen Pertanian.\nSebagai ilmuwan, Treub terkenal karena hasil penelitiannya dalam bidang morfologi tanaman tropika yang tidak ada di tempat lain, kecuali di Indonesia. Hasil kerja keras Treub ini menjadikan nama Treub diabadikan sebagai nama marga lumut Treubia dan marga jamur Melchoria. Tidak hanya itu saja, namanya pun juga dijadikan sebagai nama kapal penumpang buatan tahun 1912, S.S. Melchior Treub, yang pernah mengangkut Mohammad Hatta dan Sutan Syahrir ketika keduanya akan dibuang ke Digul pada awal 1934.");
        mValues.put("db_coordinate", "-6.60236, 106.79702");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "18");
        mValues.put("db_img", R.drawable.header_detail_labkulturjaringan);
        mValues.put("db_ico", R.drawable.ic_featured_labkulturjaringan);
        mValues.put("db_name", "Laboratorium Kultur Jaringan");
        mValues.put("db_subname", "Kultur Jaringan's Laboratory");
        mValues.put("db_description", "Tempat ini merupakan adalah salah satu pusat kegiatan perbanyakan tumbuhan yang dimiliki Kebun Raya Bogor. Dalam Lembaga konservasi ex-situ peran unit ini sangat penting untuk menjawab tantangan yang kini sudah mendesak. Hasil-hasil dari unit ini diharapkan dapat digunakan untuk kepentingan dalam arti luas yaitu pemenuhan kebutuhan masyarakat sebagai usaha pemanfaatan sumber daya hayati secara berkelanjutan.");
        mValues.put("db_coordinate", "-6.59448, 106.80307");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "19");
        mValues.put("db_img", R.drawable.header_detail_areapembibitan);
        mValues.put("db_ico", R.drawable.ic_featured_areapembibitan);
        mValues.put("db_name", "Pembibitan");
        mValues.put("db_subname", "Nursery");
        mValues.put("db_description", "Tempat dimana pembudidayaan benih biji. Unit seleksi lebih difokukskan pada pengembangan jenis-jenis terpilih, terutama dari jenis suku Araceae. Nepenthaceae dan jenis-jenis paku. Dari data inventarisasi jenis-jenis yang ada di unit seleksi adalah sebagai sebagai berikut : Suku Araceae terdiri atas 19 marga, 39 jenis dan 730 spesimen; Suku Nepentheceae terdiri atas 11 marga, 11 jenis; paku-pakuan terdiri atas 24 suku, 46 marga, dan sekitar 200 jenis. Target yang diharapkan dalam unit seleksi adalah hibridisasi.");
        mValues.put("db_coordinate", "-6.60185, 106.79735");
        db.insert("detail_featured", "_id", mValues);

        mValues.put("_id", "20");
        mValues.put("db_img", R.drawable.header_detail_monumendrjjsmith);
        mValues.put("db_ico", R.drawable.ic_featured_monumendrjjsmith);
        mValues.put("db_name", "Monumen DR JJ SMITH");
        mValues.put("db_subname", "Dr. JJ SMITH Monument");
        mValues.put("db_description", "Seseorang yang menganalisa spesies tanaman anggrek");
        mValues.put("db_coordinate", "-6.6016, 106.79963");
        db.insert("detail_featured", "_id", mValues);

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS detail_featured");
        onCreate(db);

    }

}
