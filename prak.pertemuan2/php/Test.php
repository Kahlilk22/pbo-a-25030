<?php

require_once 'Mahasiswa.php';

try {
    $m1 = new Mahasiswa('2024001', 'Andi Lestari', 85, 78, 90);
    $m2 = new Mahasiswa('2024002', 'Budi Santoso', 60, 55, 62);
    $m3 = new Mahasiswa('2024003', 'Citra Wijaya', 92, 88, 95);

    echo $m1 . PHP_EOL;
    echo $m2 . PHP_EOL;
    echo $m3 . PHP_EOL;

    echo PHP_EOL;

    $m4 = new Mahasiswa('2024004', 'Salah Nilai', 150, 80, 80);
    echo $m4 . PHP_EOL;

} catch (InvalidArgumentException $e) {
    echo 'Ditolak: ' . $e->getMessage() . PHP_EOL;
}