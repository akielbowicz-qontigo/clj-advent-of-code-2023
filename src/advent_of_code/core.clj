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
   
(defn digitos-numericos 
  [linea]
  (filter #(Character/isDigit (second %)) (map-indexed (fn [i x] [i x]) linea))
  )

(def numeros
  {"one" \1 
   "two" \2
   "three" \3
   "four" \4
   "five" \5
   "six" \6
   "seven" \7
   "eight" \8
   "nine" \9})

(defn indice
  [linea numero]
  (clojure.string/index-of linea numero)
  )

(defn indices
  [linea]
  (filter (fn [[i d]] (not (nil? i)))
   (map (fn [[s d]] [(indice linea s) d]) numeros)))

(defn digitos-palabra
  [linea]
(filter (fn [[i d]] (not (nil? i)))
        (indices linea))
  )

(defn extraer-digitos
  [linea]
  (map second
   (sort-by first (concat (digitos-numericos linea) (digitos-palabra linea)))))

(defn procesar-linea-p2
  [linea]
  (Integer/parseInt (clojure.string/join (primero-y-ultimo (extraer-digitos linea)))))

(defn dia-1-parte-2
  ""
  [input]
   (apply + (map procesar-linea-p2 (clojure.string/split-lines input))))