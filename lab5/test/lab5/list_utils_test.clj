(ns lab5.list-utils-test
  (:require [clojure.test :refer :all]
            [lab5.list-utils :refer :all]))

(deftest list-len-test
  (testing "lab5 list-len"
    (let [test-data [['(1 :a :c (2) 3 (4 8) 9) 7]
                     ['(1 :a :c (2 22 222) 3 (4 8) 9) 7]]]
      (doseq [[coll expected] test-data]
        (is (= expected (list-len coll)))))))

(deftest list-len-rec-test
  (testing "lab5 list-len-rec"
    (let [test-data [['(1 :a :c (2) 3 (4 8) 9) 8]
                     ['(1 :a :c (2 22 222) 3 (4 8) 9) 10]]]
      (doseq [[coll expected] test-data]
        (is (= expected (list-len-rec coll)))))))
