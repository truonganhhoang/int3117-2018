describe('Trang Lớp 10', function() {
  it ('Visit hoclieu', function () {
    cy.visit('https://hoclieu.sachmem.vn/folder/0')
  })

  it ('Chọn lớp 10', function () {
    cy.get(`button[title="Lớp 10"]').click;
  })

  cy.contains("Ngân hàng câu hỏi Lớp 10");
  cy.contains("Tiếng Anh 10 Tập 1 Sách bài tập");
  cy.contains("Tiếng Anh 10 Tập 2 Sách bài tập");
}