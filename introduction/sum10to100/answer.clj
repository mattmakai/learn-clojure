(ns sum10to100
	(:use clojure.test))

(defn sumMinToMax [current, max, increment, vals-list]
	(println current)
	(conj vals-list current)
	(if (>= current max)
		(and (println (reduce + vals-list))
		current)
		(sumMinToMax (+ current increment) max increment (conj vals-list current))))

(defn sum10to100 []
	(sumMinToMax 10 100 10 '(0)))

