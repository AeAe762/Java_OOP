// Версия 2
package Lessons01.Lecture.Ex004;

public class Robot2 {
        /**Уровень робота */
        private int level;

        /**Имя робота */
        private String name;

        /**
         * Создание робота
         * @param name Имя робота !Не должно начинаться с цифры
         * @param level Уровень робота
         */
        public Robot2(String name, int level)
        {
            this.name = name;
            this.level = level;
        }
        
        // Методы вкл\выкл подсистем
        
        public void powerOn(){ // Объедили несколько методов для включения 
            this.startBIOS();
            this.startOS();
            this.sayHi();
        }

        public void powerOff(){ // Объедили несколько методов для выключения
            this.sayBye();
            this.stopOS();
            this.stopBIOS();
        }

        public int getLevel(){ // Метод чтобы нельзя было изменить уровень 
            return this.level;
        }        

        public String getName(){ // Метод чтобы нельзя поменять имя робота
            return this.name;
        }        

        /**Загрузка BIOS */
        private void startBIOS() { System.out.println("Start BIOS..."); }

        /**Загрузка OS */
        private void startOS() { System.out.println("Start OS...");   }

        /**Приветствие */
        private void sayHi() { System.out.println("Hello world..."); }

        /**Выгрузка BIOS */
        private void stopBIOS() { System.out.println("Stop BIOS..."); }
        
        /**Выгрузка OS */
        private void stopOS() { System.out.println("Stop OS..."); }

        /**Прощание */
        private void sayBye() { System.out.println("Bye..."); }

        /**Работа */
        public void work() { System.out.println("Working..."); }
    }
