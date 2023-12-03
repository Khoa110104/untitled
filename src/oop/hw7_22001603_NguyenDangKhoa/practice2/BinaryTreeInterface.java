package oop.hw7_22001603_NguyenDangKhoa.practice2;

import hw7_22001603_NguyenDangKhoa.practice2.Node;

public interface BinaryTreeInterface {
    hw7_22001603_NguyenDangKhoa.practice2.Node root();
    int size();
    boolean isEmpty();
    int numChildren(hw7_22001603_NguyenDangKhoa.practice2.Node p);
    hw7_22001603_NguyenDangKhoa.practice2.Node parent(hw7_22001603_NguyenDangKhoa.practice2.Node p);
    hw7_22001603_NguyenDangKhoa.practice2.Node left(hw7_22001603_NguyenDangKhoa.practice2.Node p);
    hw7_22001603_NguyenDangKhoa.practice2.Node right(hw7_22001603_NguyenDangKhoa.practice2.Node p);
    hw7_22001603_NguyenDangKhoa.practice2.Node sibling(Node p);
}
