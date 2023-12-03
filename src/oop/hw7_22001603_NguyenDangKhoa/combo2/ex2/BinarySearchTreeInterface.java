package oop.hw7_22001603_NguyenDangKhoa.combo2.ex2;

import hw7_22001603_NguyenDangKhoa.combo2.ex2.Node;

public interface BinarySearchTreeInterface {
   hw7_22001603_NguyenDangKhoa.combo2.ex2.Node root();
    int size();
    boolean isEmpty();
    hw7_22001603_NguyenDangKhoa.combo2.ex2.Node parent(hw7_22001603_NguyenDangKhoa.combo2.ex2.Node p);
    hw7_22001603_NguyenDangKhoa.combo2.ex2.Node left(hw7_22001603_NguyenDangKhoa.combo2.ex2.Node p);
    hw7_22001603_NguyenDangKhoa.combo2.ex2.Node right(Node p);
}
