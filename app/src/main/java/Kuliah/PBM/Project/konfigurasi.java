package Kuliah.PBM.Project;

public class konfigurasi {
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://infosumbarproject.000webhostapp.com/tambahFood.php";
    public static final String URL_GET_ALL = "http://infosumbarproject.000webhostapp.com/tampilSemuaFood.php";
    public static final String URL_GET_EMP = "http://infosumbarproject.000webhostapp.com/tampilFood.php?id=";
    public static final String URL_UPDATE_EMP = "http://infosumbarproject.000webhostapp.com/updateFood.php";
    public static final String URL_DELETE_EMP = "http://infosumbarproject.000webhostapp.com/hapusFood.php?id=";

    public static final String URL_GET_SEJARAH = "http://infosumbarproject.000webhostapp.com/sejarah.php";

    //tarian
    public static final String URL_GET_AllDance = "http://infosumbarproject.000webhostapp.com/tampilSemuaDance.php";
    public static final String URL_GET_Dance = "http://infosumbarproject.000webhostapp.com/tampilDance.php?id=";
    public static final String URL_UPDATE_Dance = "http://infosumbarproject.000webhostapp.com/updateDance.php";
    public static final String URL_DELETE_Dance = "http://infosumbarproject.000webhostapp.com/hapusDance.php?id=";

    //wisata
    public static final String URL_GET_AllDestination = "http://infosumbarproject.000webhostapp.com/tampilSemuaDestination.php";
    public static final String URL_GET_Destination = "http://infosumbarproject.000webhostapp.com/tampilDestination.php?id=";
    public static final String URL_UPDATE_Destination = "http://infosumbarproject.000webhostapp.com/updateDestination.php";
    public static final String URL_DELETE_Destination = "http://infosumbarproject.000webhostapp.com/hapusDestination.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "posisi"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_GAJIH = "salary"; //salary itu variabel untuk gajih

    public static final String KEY_EMP_DANCE = "dance"; //desg itu variabel untuk tarian
    public static final String KEY_EMP_Destination = "destination"; //desg itu variabel untuk tarian



    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "posisi";
    public static final String TAG_GAJIH = "salary";
    public static final String TAG_SEJARAH = "history";
    public static final String TAG_DANCE = "dance";
    public static final String TAG_Destination = "destination";

    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
