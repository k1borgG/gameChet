(ns mire.logging)

(def player-log (ref #{}))

(defn log-player [player-name]
  (dosync
    (alter player-log conj player-name)))

(defn get-logged-players []
  @player-log)
