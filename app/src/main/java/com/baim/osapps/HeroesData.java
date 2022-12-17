package com.baim.osapps;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Account",
            "Account Auditor",
            "Account Server",
            "Access Key",
            "Access Control List",
            "Accounting",
            "Builder File",
            "Account Service",
            "Call",
            "Catalog"
    };

    private static String[] heroDetails = {
            "Objek Storage konteks akun. Jangan bingung dengan akun pengguna dari layanan\n" +
                    "otentikasi, seperti Active Directory, /etc/passwd, OpenLDAP, OpenStack Identitas, dan\n" +
                    "sebagainya.",

            "Auditor account adalah akuntan publik yang menyediakan jasa berupa auditing dengan tujuan untuk memeriksa laporan keuangan suatu perusahaan agar bebas dari kesalahan uji. Nah, secara umum ada dua sikap yang harus dimiliki oleh seorang auditor, yaitu kompeten dan independen.",

            "Daftar kontainer di Object Storage dan menyimpan informasi kontainer dalam database akuntansi.",

            "Alternative term for an Amazon EC2 access key. See EC2 access key.",

            "Access Control Lists (ACLs) adalah tool yang penting dan cukup berguna di dalam jaringan komputer. ACL memungkinkan administrator jaringan untuk menyaring lalu lintas traffic yang masuk ataupun keluar dari perangkat jaringan.",

            "Layanan Computer memberikan informasi akuntansi melalui pemberitahuan acara dan\n" +
                    "penggunaan sistem fasilitas data.",

            "Berisi informasi konfigurasi yang Object Storage digunakan untuk mengkonfigurasi sebuah\n" +
                    "cincin (ring) atau untuk menciptakan kembali dari awal (scratch) setelah kegagalan serius.",

            "Komponen Storage Obyek yang menyediakan layanan akun seperti daftar, membuat,\n" +
                    "memodifikasi, dan audit. Jangan bingung dengan layanan OpenStack Identity, OpenLDAP,\n" +
                    "atau layanan user-akun yang sama.",

            "Salah satu primitif RPC digunakan oleh perangkat lunak pesan antrian OpenStack. Mengirim\n" +
                    "pesan dan menunggu respons.",

            "Daftar endpoint API yang tersedia untuk pengguna setelah otentikasi dengan layanan\n" +
                    "Identity."
    };
    private static int[] heroesImages = {
            R.drawable.user,
            R.drawable.auditor,
            R.drawable.server,
            R.drawable.key,
            R.drawable.acl,
            R.drawable.akuntansi,
            R.drawable.build,
            R.drawable.service,
            R.drawable.call,
            R.drawable.catalog
    };

    private static String[] heroesLinks ={
            "www.skillacademy.com",
            "www.alison.com",
            "www.purwadhika.com",
            "www.binaracademy.com",
            "www.udemy.com",
            "www.hostinger.co.id",
            "www.idntimes.com",
            "www.indoworx.com",
            "www.hacktiv8.com",
            "www.course-net.com"
    };


    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            hero.setLink(heroesLinks[position]);
            list.add(hero);
        }
        return list;
    }
}
