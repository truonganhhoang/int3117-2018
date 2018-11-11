describe('testHocLieu', function() {
  it('Visits the Kitchen Sink', function() {
    
    cy.visit('https://hoclieu.sachmem.vn/folder/0');
    cy.contains('Lớp 3').click()
    cy.contains('Tiếng Anh 3 Tập 1').click()
    cy.get('.fa-th-list').click()
    cy.contains('A').click()
  })
})
