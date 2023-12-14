(ns advent-of-code.core)

(defn primero-y-ultimo
  [digitos]
  [(first digitos) (last digitos)])

(defn digitos
  [linea]
  (filter #(Character/isDigit %) linea))

(defn procesar-linea
  [linea]
  (Integer/parseInt (clojure.string/join (primero-y-ultimo (digitos linea)))))

(defn dia-1
  "resuelve el problema del dia 1"
  [input]
  (apply + 
  (map procesar-linea (clojure.string/split-lines input))
  ))
   
(defn procesar-linea-p2
  [linea]
  linea)

(defn dia-1-parte-2
  ""
  [input]
  input)