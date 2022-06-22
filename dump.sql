-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306:8889
-- Generation Time: Jun 14, 2022 at 11:45 AM
-- Server version: 10.6.4-MariaDB
-- PHP Version: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `proje`
--

-- --------------------------------------------------------

--
-- Table structure for table `projeler`
--

CREATE TABLE `projeler` (
  `id` int(11) NOT NULL,
  `proje_adi` varchar(255) DEFAULT NULL,
  `proje_konusu` text DEFAULT NULL,
  `proje_baslangic_tarih` date DEFAULT NULL,
  `proje_bitis_tarih` date DEFAULT NULL,
  `proje_yoneticisi` varchar(255) DEFAULT NULL,
  `proje_durumu` text DEFAULT NULL,
  `proje_grup_sayisi` int(11) NOT NULL DEFAULT 1,
  `proje_gozetmeni` varchar(255) DEFAULT NULL,
  `proje_puani` int(11) NOT NULL DEFAULT 0,
  `proje_kategorisi` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `projeler`
--

INSERT INTO `projeler` (`id`, `proje_adi`, `proje_konusu`, `proje_baslangic_tarih`, `proje_bitis_tarih`, `proje_yoneticisi`, `proje_durumu`, `proje_grup_sayisi`, `proje_gozetmeni`, `proje_puani`, `proje_kategorisi`) VALUES
(1, 'YUFKA, MANTI VE UNLU ÜRÜNLERDE KAPASİTE\nARTIRILMASI', 'Serpa Gıda, proje kapsamında temin edilen makine-ekipman ile ürün yelpazesini genişletmiş olup; daha önce üretemedikleri kuru pasta ve manç\nüreèmine geçmişlerdir. Projeden önce paketleme konusunda kalite problemleri yaşayan firma, projeyle beraber ürünlerin vakumlu paketlenmesi\nile, ürünlerin raf ömürlerini uzatmıştır. ', '2022-06-13', '2022-06-14', 'SERPA İNŞAAT GIDA MEDİKAL TEKSTİL\nHAYVANCILIK TİC. VE SAN. LTD. ŞTİ.', 'Başladı', 1, 'Hatice Çekim', 7, 'ÖZEL SEKTÖR'),
(2, 'AZOT PRODOKSİT NARKOZ GAZI ÜRETİM VE\nDOLUM TESİSİ', 'Proje kapsamında «Narkoz gazı» üretim ve dolum tesisi yapılmışèr.\nTürkiye’de bu üreÅmi yapan 4. firmadır. Deneme üretimleri ve Sağlık Bakanlığı izinlerinden (1,5 yıl) sonra üreÅm netleşmiş ve 2015 yılında üretim\nbaşlanacaktır. Elde edilen ürün hastanelere saèlacakèr. Ürün Türkiye çapında her yere gönderilebilecektir.', '2022-06-01', '2022-06-05', 'ASİLGAZ TIBBİ VE SINAÎ GAZLAR İMALAT VE\nTİCARET LTD.ŞTİ.', 'Bitti', 1, 'Hatice Çekim', 7, 'ÖZEL SEKTÖR'),
(3, 'SU FABRİKASI 0,5\"1,5 PET HAT KURULUMU', '5-10 lt  ve 19 lt damacana üretim hatlarına ilave olarak proje ile, 0,5-\n1,5 litre kaynak suyu üretim kurularak ürün çeşitliliği artırılmıştır. Diğer\nhatlarla birlikte firma 2011 yılının Haziran ayında üreÅme başlamıştır', '2019-09-12', '2019-11-21', 'KARİVAN GIDA SU AMBALAJLAMA YAK.TEKS.TURZ.\nNAK.SAN VE TİC A.Ş.', 'Bitti', 1, 'Ahmet Irgat', 9, 'KAMU'),
(4, 'SOĞUTMA ÜNİTELERİ İMALATINDA KAPASİTE\nARTIRIMI VE POLİÜRETAN PANEL ÜRETİMİ', 'Endüstriyel soğutma alanında faaliyet gösteren firma, proje kapsamında\nalınan makineler ile poliüretan panelleri üreèmine başlamıştır. Firmanın 6\nfarklı ürün çeşidi bulunmaktadır. ', '2015-07-10', '2023-01-06', 'ENVER ÖZ $ ELSAN SOĞUTMA', 'Devam ediyor', 2, 'Ahmet Irgat', 10, 'KAMU'),
(5, 'MUNZUR SU KAPASİTE ARTIRIMI PROJESİ', 'Tunceli’nin Ovacık ilçesi Gözeler Mevkii’nde Munzur Çay’ının ana çıkış yeri\nolan doğal su kaynağının şişelendiği tesiste, ikinci 0,5-1,5 Lt şişeleme\nkurularak firmanın üreùm kapasitesinde önemli bir ar!ş gerçekleştirilimiştir. ', '2018-09-04', '2018-12-28', 'MUNZUR TARIM VE TİCARET ÜRÜNLERİ A.Ş', 'Başladı', 3, 'Gül Ergün', 10, 'ÖZEL SEKTÖR'),
(6, 'ISIL İŞLEM ÜRETİM SÜREÇLERİNİN\nMULTİDİSİPLİNER YATIRIMLARLA İYİLEŞTİRİLMESİ\nVE BÖLGE SANAYİNİN GELİŞTİRİLMESİ', 'Malatya 1. Organize Sanayi Bölgesindeki işletmesinde, sfero, çelik ve pik\ndöküm ürünleri üretmekte olan firma, proje kapsamında alınan indüksiyon\nocağı, CNC torna tezgahı, freze tezgahı ve mini yükleyici ile kapasitesini arêrmış, mikroskop ve zımparalama-parlatma cihazı ile ürünlerinin kalite testlerini kendi bünyesinde yapmaya başlamıştır.', '2022-01-01', '2023-01-06', 'MALATYA METAL İŞLEME MERKEZİ SAN. VE. TİC.\nA.Ş.', 'Devam ediyor', 2, 'Ahmet Irgat', 10, 'ÖZEL SEKTÖR'),
(7, 'ÜRETİMDE VE KALİTEDE REKABETÇİ GELİŞİM\nPROJESİ', 'Asansör kapıları ve kabinleri üreten firma proje öncesinde boya işlerini bölge dışında yaptırıken, proje kapsamında tedarik edilen elektrostaêk toz boyama ünitesi ile asansör kapılarının temizleme ve boyama işlemlerini kendi\nbünyesinde yapmaya başlamıştır. ', '2022-06-14', '2023-01-06', ' İDA ASANSÖR SANAYİ VE TİCARET LİMİTED\nŞİRKETİ', 'Başladı', 2, 'Gül Ergün', 10, 'ÖZEL SEKTÖR'),
(8, 'SÜT İŞLEME VE PAKETLEME TESİSİ KAPASİTE\nARTIRMA PROJESİ', 'Çevre köy ve çevrelerde topladığı sütü işleyerek ayran, yoğurt ve peynir\nbenzeri paketlenmiş süt ürünleri üreten firma proje ile üreùm kapasitesini\ngelişùrmiş ve yeni ürün olarak lor ve kaşar peyniri üreùmine başlamıştır.\nProje kapsamında alınan laboratuvar ekipmanı ile ürün kalitesini ar!ran\nfirma alınan depolama ve nakil tankları ile de pazarlama ağını geliştirmiştir.', '2019-12-06', '2023-01-06', 'ÇAĞDAŞ PERTEK TARIM VE HAYV. TURZ. İNŞ. GIDA\nÜRETİM PAZARLAMA SAN. VE TİC. LTD. ŞTİ.', 'Devam ediyor', 2, 'Ahmet Irgat', 10, 'KAMU'),
(9, 'ÇERÇEVEDE TEKNOLOJİ ÇAĞI PROJESİ', 'Çevre köy ve çevrelerde topladığı sütü işleyerek ayran, yoğurt ve peynir\nbenzeri paketlenmiş süt ürünleri üreten firma proje ile üreùm kapasitesini\ngelişùrmiş ve yeni ürün olarak lor ve kaşar peyniri üreùmine başlamış!r.\nProje kapsamında alınan laboratuvar ekipmanı ile ürün kalitesini ar!ran\nfirma alınan depolama ve nakil tankları ile de pazarlama ağını gelişùrmişùr.', '2022-01-01', '2023-01-06', 'KUTLU OPTİK PAZARLAMA SAN. VE TİC. LTD. ŞTİ.', 'Bitti', 2, 'Gül Ergün', 10, 'ÖZEL SEKTÖR'),
(10, 'ALAŞIMLI KROM KAPLAMA ÇELİK MAKİNE\nPARÇASI ÜRETİMİ', 'Proje ile firma, İndüksiyon ocağı ve ısıl işlem ürünü satın alarak, piyasanın\ntalep ettiği bimetal (metal alaşımı) yedek parça dökümü yapabilecek\nduruma gelmiştir.', '2019-06-20', '2023-01-06', 'FIRAT DÖKÜM METALURJİ MAK. İML. TAAH. SAN.\nVE TİC. LTD. ŞTİ.', 'Devam ediyor', 2, 'Ahmet Irgat', 10, 'ÖZEL SEKTÖR'),
(11, 'SOMAY AMBALAJ KAPASİTE ARTIŞI PROJESİ', 'Malatya’da çevrelerde olmayan gıda ambalajı için geliştirilen proje sonucunda\nfirma, standartlara uygun raf ömrü uzun gıda paketlemesi yapabilir duruma\ngeliştirilmiştir.', '2021-03-10', '2023-01-06', 'SOMAY PLASTİK SANAYİ VE TİCARET LTD. ŞTİ.', 'Devam ediyor', 2, 'Gül Ergün', 10, 'ÖZEL SEKTÖR');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `projeler`
--
ALTER TABLE `projeler`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `projeler`
--
ALTER TABLE `projeler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
