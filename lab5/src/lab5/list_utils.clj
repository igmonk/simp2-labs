(ns lab5.list-utils)

(defn list-len
  [coll]
  (count coll))

(defn list-len-rec
  [coll]
  (if (seq? coll)
    (reduce (fn [acc item]
              (+ acc (list-len-rec item)))
            0
            coll)
    1))
