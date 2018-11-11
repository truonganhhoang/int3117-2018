describe('Test Exam', function(){
  it('Access to the page', function () {
    cy.visit('https://hoclieu.sachmem.vn/folder/L%E1%BB%9Bp_3-5a4b188848150cd8b9065234');
  });
  it('Choosse Tiếng Anh 3 Tập 1', function () {
    cy.contains('Tiếng Anh 3 Tập 1').click();
  });

  it('Do exam', function () {
    //Chon hinh thuc tra loi
    it('Choosse type', function () {
      cy.contains('Làm cả bài').click();
    });
    // Tra loi cac cau hoi
    cy.get('.select05b593e33a653fc8e194c7de4 > .row > :nth-child(1) > .select-check').click()
    cy.get('.select05b593e33a653fc8e194c7de5 > .row > :nth-child(1) > .select-check').click()
    cy.get('.select05b593e33a653fc8e194c7de6 > .row > :nth-child(1) > .select-check').click()
    cy.get('.select05b593e33a653fc8e194c7de7 > .row > :nth-child(1) > .select-check').click()
    cy.get('.select05b593e33a653fc8e194c7de8 > .row > :nth-child(1) > .select-check').click()
    // Nop bai
    cy.get('.btn-warning').click()
  })
})
