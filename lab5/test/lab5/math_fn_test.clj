(ns lab5.math-fn-test
  (:require [clojure.test :refer :all]
            [lab5.math-fn :refer :all]))

(deftest total-m-n-test
  (testing "lab5 total-m-n"
    (let [actual (total-m-n 1 1)]
      (is (> actual 0)))))
