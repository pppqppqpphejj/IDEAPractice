package com.hisen.mybatis.model;

/**
 * MyBatis-generator自动生成
 */
public class Book {

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column book.book_id
   *
   * @mbggenerated Wed Mar 22 09:54:59 CST 2017
   */
  private Long bookId;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column book.name
   *
   * @mbggenerated Wed Mar 22 09:54:59 CST 2017
   */
  private String name;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column book.number
   *
   * @mbggenerated Wed Mar 22 09:54:59 CST 2017
   */
  private Integer number;

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column book.book_id
   *
   * @return the value of book.book_id
   * @mbggenerated Wed Mar 22 09:54:59 CST 2017
   */
  public Long getBookId() {
    return bookId;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column book.book_id
   *
   * @param bookId the value for book.book_id
   * @mbggenerated Wed Mar 22 09:54:59 CST 2017
   */
  public void setBookId(Long bookId) {
    this.bookId = bookId;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column book.name
   *
   * @return the value of book.name
   * @mbggenerated Wed Mar 22 09:54:59 CST 2017
   */
  public String getName() {
    return name;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column book.name
   *
   * @param name the value for book.name
   * @mbggenerated Wed Mar 22 09:54:59 CST 2017
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column book.number
   *
   * @return the value of book.number
   * @mbggenerated Wed Mar 22 09:54:59 CST 2017
   */
  public Integer getNumber() {
    return number;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column book.number
   *
   * @param number the value for book.number
   * @mbggenerated Wed Mar 22 09:54:59 CST 2017
   */
  public void setNumber(Integer number) {
    this.number = number;
  }
}