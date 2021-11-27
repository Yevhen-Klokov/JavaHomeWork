package com.pb.klokov.hw10;

public class Main {
    public static void main(String[] args)  {
        NumBox<Integer> nums = new NumBox<>(5);
        nums.add(0,1);
        nums.add(1,2);
        nums.add(2,3);
        nums.add(3,4);
        nums.add(4,5);

        System.out.println("Массив Integer " + nums);
        System.out.println("Попитка добавить в массив элемент 6 под индексом 5");
        nums.add(5,6);

        System.out.println("Число массива по индекусу 0: " + nums.get(0));
        System.out.println("К-во элементов массива: " + nums.length());
        System.out.println("Среднее значение элементов массива: " + nums.average());
        System.out.println("Сумма элеменов массива: " + nums.sum());
        System.out.println("Максимальний элемент массива: " + nums.max());

        NumBox<Double> nums1 = new NumBox<>(5);
        nums1.add(0,1.1);
        nums1.add(1,2.1);
        nums1.add(2,3.1);
        nums1.add(3,4.1);
        nums1.add(4,5.1);

        System.out.println("Массив Double " + nums1);
        System.out.println("Попитка добавить в массив элемент 6.1 под индексом 5");
        nums1.add(5,6.1);

        System.out.println("Число массива по индекусу 0: " + nums1.get(0));
        System.out.println("К-во элементов массива: " + nums1.length());
        System.out.println("Среднее значение элементов массива: " + nums1.average());
        System.out.println("Сумма элеменов массива: " + nums1.sum());
        System.out.println("Максимальний элемент массива: " + nums1.max());

        NumBox<Float> nums2 = new NumBox<>(5);
        nums2.add(0,1.2F);
        nums2.add(1,2.2F);
        nums2.add(2,3.3F);
        nums2.add(3,4.4F);
        nums2.add(4,5.5F);

        System.out.println("Массив Double " + nums2);
        System.out.println("Попитка добавить в массив элемент 6.1 под индексом 5");
        nums2.add(5,6.2F);

        System.out.println("Число массива по индекусу 0: " + nums2.get(0));
        System.out.println("К-во элементов массива: " + nums2.length());
        System.out.println("Среднее значение элементов массива: " + nums2.average());
        System.out.println("Сумма элеменов массива: " + nums2.sum());
        System.out.println("Максимальний элемент массива: " + nums2.max());
    }

}
