(ns lab5.core
  (:gen-class)
  (:require [lab5.math-fn :refer :all]
            [lab5.list-utils :refer :all]))

(defn -main
  [& args]
  (let [task1-result (total)
        task2-result (list-len '(1 :a :c (2) 3 (4 8) 9))]
    (prn "Task1 result: " task1-result)
    (prn "Task2 result: " task2-result)))
