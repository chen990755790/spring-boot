package com.example.model;

public class Example {

    protected String orderByClause;

    protected boolean distinct;

    private Page page;

    private String pageCondition;

    public Example() {
        page = new Page();
    }

    public Example(int total) {
        this.page = new Page(total);
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return "1";
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public String getPageCondition() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" offset ");
        stringBuilder.append(page.getPageIndex());
        stringBuilder.append(" rows");
        stringBuilder.append(" fetch next ");
        stringBuilder.append(page.getPageSize());
        stringBuilder.append(" rows only");
        return stringBuilder.toString();
    }

    public Page getPage() {
        return page;
    }
}