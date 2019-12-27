package com.madv.moikar.domain;

import com.madv.moikar.other.Trifle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.List;

/**
 * Базовый класс для всех Entity проекта
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@ToString
@Slf4j
public abstract class BaseEntity<ID> implements Serializable {
    /**
     * Удаляет лидирующие и завершающие пробелы в тнепустых строках.
     * Рекомендуется к встраиванию в сеттеры классов сущнеостей для тех полей (логин, телефон, email и т.п., где это необходимо).
     * Решает проблему некорректной работы валидаторов типа @Length и @Size, настренных на ограничение длин значений.
     * Например, если "логин должен быть от 3 до 16 символов", то ведь неправильно будет валидировать логин из 4 пробелов :)
     */
    public static String trim(String string) {
        return string == null ? null : string.trim();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ID id;

    //  получение списка записей дочерней таблицы
    public <C extends BaseEntity<ID>, ID> List<C>
    getChildList(String nameRefChildTable) {
        List<C> res = null;
        try {
            res = (List<C>) (this.getClass()
                    .getMethod("get" + Trifle.firstUpperCase(nameRefChildTable), null)
                    .invoke(this, null));
        } catch (Exception e) {
            log.error("Ошибка чтения поля метод: {} таблица: {} детали: {}",
                    nameRefChildTable, this.getClass().getName(), e);
        }
        return res;
    }

    // получение индекса записи в списке по ее Id в таблице
    public static  <C extends BaseEntity<ID>, ID> int getIndexChild(List<C> cList, ID idChild) {
        int result = -1;
        ID id;
        int size = cList.size();
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                id = cList.get(i).getId();
                if (id.equals(idChild)) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}