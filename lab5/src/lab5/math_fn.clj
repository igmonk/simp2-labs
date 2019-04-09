(ns lab5.math-fn)

(defn total-m-n
  [m n]
  (let [top (Math/cos (Math/exp (- (* 0.9 n) (* 0.4 m))))
        bottom (+ (Math/pow m 5)
                  (Math/pow n 2)
                  (- (Math/log (+ (Math/cos 0.6)
                                  (Math/sin (+ 0.2 Math/PI))))))]
    (-> (/ top bottom)
        Math/abs
        Math/sqrt)))

(defn total
  []
  (total-m-n 1 1))
