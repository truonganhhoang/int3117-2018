describe('Test tham gia lop hoc', () => {
    it('visit website', () => {
      cy.visit('https://hoclieu.sachmem.vn/folder/0');
    });
  
    it('test tham gia lop hoc', () => {
        cy.get('.alert > :nth-child(2)').click()

    });
  
    it('test input ma tham gia lop', () => {
      cy.get(':nth-child(2) > .form-control').type('15021768').should('have.value', '15021768');
    });
  
    it('test input ho va ten', () => {
      cy.get(':nth-child(3) > .form-control').type('cuongdn').should('have.value', 'cuongdn');
    });
  
    it('test inputinput lop', () => {
      cy.get(':nth-child(4) > .form-control').type('K60CA').should('have.value', 'K60CA');
    });

    it('test save information when lack biet danh', () => {
        cy.get('.btn-primary').click();
        cy.get('.error-text').should('have.contain','Trường này không được để trống');
    });

    it('test fill full information and click save', () => {
        cy.get(':nth-child(5) > .form-control').type('bitagi').should('have.value','bitagi');
        cy.get('.btn-primary').click()
        cy.get('.toast').should('have.class','toast-error')
    });
    
  });
  