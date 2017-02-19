;; Copyright ©️ Rachel Bowyer 2017. All rights reserved.
;;
;; This program and the accompanying materials
;; are made available under the terms of the Eclipse Public License v1.0
;; which accompanies this distribution, and is available at
;; http://www.eclipse.org/legal/epl-v10.html

(ns keirin-demo.core
  (:require [analemma.charts :refer :all]
            [keirin.core :as k])
  (:gen-class))

(defn- generate-point [i]
  (let [num-elements (* (inc i) 100000)
        data (doall (range num-elements))]
    [num-elements (:median (k/bench (vec data) :reporting :underlying-results))]))

(defn- generate-points [n]
  (vec (for [i (range n)] (generate-point i))))


(defn- create-vec-graph []
  (spit "vec-performance.svg"
        (emit-svg
          (-> (xy-plot :xmin 0 :xmax 1000000
                       :ymin 0 :ymax 20
                       :height 500 :width 500)
              (add-points (generate-points 10))))))

(defn -main [& args]
  (create-vec-graph))
