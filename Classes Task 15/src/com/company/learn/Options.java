package com.company.learn;

public class Options {

    public enum Food {
        BREAKFAST{
            public String toString() {
                return "завтрак включён";
            }
        },
        WITHOUT{
            public String toString() {
                return "питание не включено";
            }
        },
        BREAKFAST_AND_DINNER{
            public String toString() {
                return "завтрак и обед включены";
            }
        }
    }

    public enum Transport {
        BUS{
            public String toString() {
                return "автобус";
            }
        },
        TRAIN{
            public String toString() {
                return "поезд";
            }
        },
        PLANE{
            public String toString() {
                return "самолёт";
            }
        },
        SHIP{
            public String toString() {
                return "лайнер";
            }
        }
    }

    public enum TypeOfTour {
        RECREATION{
            public String toString() {
                return "отдых";
            }
        },
        SHOPPING{
            public String toString() {
                return "покупки";
            }
        },
        EXCURSION{
            public String toString() {
                return "экскурсия";
            }
        },
        TREATMENT{
            public String toString() {
                return "лечение";
            }
        },
        CRUISE{
            public String toString() {
                return "круиз";
            }
        }
    }

}
