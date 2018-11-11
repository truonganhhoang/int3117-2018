describe('Test SEMAT Questions', function(){
    it('Access https://hoclieu.sachmem.vn/folder/Khác-5aa5e59802f3150e8921abb7', function () {
        cy.visit('https://hoclieu.sachmem.vn/folder/Khác-5aa5e59802f3150e8921abb7');
    });
    it ('Choose SEMAT Questions', function () {
        cy.contains('SEMAT Questions').click();
    });
    it ('Do first question', function () {
        cy.contains('Làm từng câu').click();
        cy.get('div[class="options col-md-6 col-xs-12 mt-2 ng-star-inserted"] div:first').click();
        cy.contains('Chốt').click();
        cy.get('button[title="Câu tiếp"]').click();

        cy.get('div[class="options col-md-6 col-xs-12 mt-2 ng-star-inserted"] div:first').click();
        cy.contains('Chốt').click();
        cy.get('button[title="Câu tiếp"]').click();

        cy.get('div[class="options col-md-6 col-xs-12 mt-2 ng-star-inserted"] div:first').click();
        cy.contains('Chốt').click();
        cy.get('button[title="Câu tiếp"]').click();

        cy.get('div[class="options col-md-6 col-xs-12 mt-2 ng-star-inserted"] div:first').click();
        cy.contains('Chốt').click();
        cy.get('button[title="Câu tiếp"]').click();
    });
});
